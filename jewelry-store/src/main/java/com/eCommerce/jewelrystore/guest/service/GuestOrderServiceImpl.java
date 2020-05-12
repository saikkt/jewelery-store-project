package com.eCommerce.jewelrystore.guest.service;

import com.eCommerce.jewelrystore.adapter.CartClient;
import com.eCommerce.jewelrystore.adapter.ProductClient;
import com.eCommerce.jewelrystore.adapter.ShippingDetailsClient;
import com.eCommerce.jewelrystore.adapter.TransactionClient;
import com.eCommerce.jewelrystore.email.util.MailSender;
import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.domain.GuestOrderItem;
import com.eCommerce.jewelrystore.guest.domain.OrderStatus;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.repository.GuestOrderItemRepository;
import com.eCommerce.jewelrystore.guest.repository.GuestOrderRepository;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;
import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import com.stripe.model.Charge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
@Component
public class GuestOrderServiceImpl implements GuestOrderService {

    private final String cartSessionAttributeName;
    private final GuestOrderRepository guestOrderRepository;
    private final GuestOrderItemRepository guestOrderItemRepository;
    private final GuestService guestService;
    private final CartClient cartClient;
    private final ShippingDetailsClient shippingDetailsClient;
    private final TransactionClient transactionClient;
    private final HttpSession httpSession;
    private final ProductClient productClient;
    private final MailSender mailSender;
    private final String guestEmailSubject;
    private final String guestEmailText;
    Logger logger = LoggerFactory.getLogger(GuestOrderServiceImpl.class);

    public GuestOrderServiceImpl(@Value("${cart.session.attribute.name}")
                                         String cartSessionAttributeName,
                                 GuestOrderRepository guestOrderRepository,
                                 GuestOrderItemRepository guestOrderItemRepository,
                                 GuestService guestService,
                                 CartClient cartClient,
                                 ShippingDetailsClient shippingDetailsClient, TransactionClient transactionClient, HttpSession httpSession,
                                 ProductClient productClient,
                                 MailSender mailSender,
                                 @Value("guest.email.subject.name")
                                         String guestEmailSubject,
                                 @Value("guest.email.text.desc")
                                         String guestEmailText) {
        this.cartSessionAttributeName = cartSessionAttributeName;
        this.guestOrderRepository = guestOrderRepository;
        this.guestOrderItemRepository = guestOrderItemRepository;
        this.guestService = guestService;
        this.cartClient = cartClient;
        this.shippingDetailsClient = shippingDetailsClient;
        this.transactionClient = transactionClient;
        this.httpSession = httpSession;
        this.productClient = productClient;
        this.mailSender = mailSender;
        this.guestEmailSubject = guestEmailSubject;
        this.guestEmailText = guestEmailText;
    }

    /**
     * This method generates guest order summary
     *
     * @return GuestOrder with only required fields for order summary
     * @throws GuestException is thrown when empty cart is accessed to generate order summary
     */
    @Transactional
    @Override
    public GuestOrder orderSummary() throws GuestException {
        final HashMap<Long, Integer> cartItems;
        GuestOrder guestOrder;
        try {
            cartItems = cartClient.getCartItems(httpSession);
            guestOrder = new GuestOrder();

            //generate order items using cart
            List<GuestOrderItem> guestOrderItems = new ArrayList<>();
            cartItems.forEach((productID, quantity) -> guestOrderItems.add(new GuestOrderItem(productID, quantity)));

            //handle taxes, discount, totalprice, unitprice
            guestOrderItems.forEach(guestOrderItem -> {
                guestOrderItem.setUnitPrice(productClient.getProductPriceByID(guestOrderItem.getProductID()));
                guestOrderItem.setTotalPrice(guestOrderItem.getUnitPrice().multiply(new BigDecimal(guestOrderItem.getQuantity())));
            });

            //Calculate CheckOut Price
            BigDecimal checkOutPrice = guestOrderItems.stream()
                    .map(GuestOrderItem::getTotalPrice)
                    .reduce(new BigDecimal(0), BigDecimal::add);

            guestOrder.setCheckoutPrice(checkOutPrice);
            //set order items list
            guestOrder.setGuestOrderItems(guestOrderItems);


        } catch (NullPointerException e) {
            logger.info("Empty Cart Session is accessed to generate order summary");
            throw new GuestException("Cart is empty, unable to generate order summary", e);
        } catch (Exception e) {
            logger.info("Error in generating order summary");
            throw new GuestException("Error in generating order summary", e);
        }
        return guestOrder;
    }

    /**
     * This method is called upon successful payment by guest
     *
     * @param guest model contains details of guest
     * @return GuestOrder
     * @throws GuestException is thrown when any event fails
     */
    @Transactional
    @Override
    public GuestOrder saveGuestOrderAndItems(Guest guest, Charge charge) throws GuestException {
        Guest savedGuest;
        GuestOrder savedGuestOrder;
        List<GuestOrderItem> guestOrderItems;

        try {
            // Save Guest Details
            savedGuest = guestService.save(guest);

            // Generate Order Summary and Dump result into GuestOrder
            // Set all the fields to guest order
            GuestOrder guestOrder = orderSummary();
            guestOrderItems = guestOrder.getGuestOrderItems();
            guestOrder.setGuestID(savedGuest.getGuestID());
            guestOrder.setGuestOrderNumber(UUID.randomUUID());
            guestOrder.setOrderDate(LocalDate.now());
            guestOrder.setOrderStatus(OrderStatus.PLACED);
            guestOrder.setObjectID(UUID.randomUUID());

            //Save GuestOrder
            savedGuestOrder = guestOrderRepository.save(guestOrder);


            guestOrderItems.forEach(guestOrderItem -> {
                guestOrderItem.setGuestOrderID(savedGuestOrder.getGuestOrderID());
                guestOrderItem.setObjectID(UUID.randomUUID());
            });

            // Save Order Items
            List<GuestOrderItem> savedGuestOrderItems = guestOrderItemRepository.saveAll(guestOrderItems);
            savedGuestOrder.setGuestOrderItems(savedGuestOrderItems);

            //Send Email
            //To do --  Check if task is completed, retry if not completed.
            CompletableFuture.runAsync(() -> sendOrderConfirmationEmail(savedGuest.getEmailAddress(),
                    savedGuestOrder.getGuestOrderNumber().toString()));

            //save transaction details
            saveTransactionDetails(savedGuestOrder.getGuestOrderID(), charge);

            //save shipping details
            saveShippingDetails(savedGuestOrder.getGuestOrderID());


            //Clear cart session
            httpSession.removeAttribute(cartSessionAttributeName);
        } catch (NullPointerException e) {
            logger.warn("Unable to place guest order");
            throw new GuestException("Null pointer accessed, unable to place guest order", e);
        } catch (Exception e) {
            logger.warn("Unable to place guest order");
            throw new GuestException("Unable to place guest order", e);
        }
        return savedGuestOrder;
    }

    /**
     * This method sends order placed confirmation email to guest.
     *
     * @param guestEmailAddress Email Address submitted by guest
     * @param orderNumber       Auto generated UUID to track guest orders
     */
    public void sendOrderConfirmationEmail(String guestEmailAddress, String orderNumber) {
        mailSender.sendEmail(guestEmailAddress,
                guestEmailSubject,
                guestEmailText + "\n" + orderNumber);
    }

    /**
     * This method saves transaction details
     * @param guestOrderID Auto generated value
     * @param charge receive from payment service
     * @throws TransactionException is thrown when saving transaction details is failed
     */
    public void saveTransactionDetails(long guestOrderID, Charge charge) throws TransactionException {
        transactionClient.saveTransaction(transactionClient.getTransactionBuilder()
                .setGuestOrderID(guestOrderID)
                .setChargeID(charge.getId())
                .setChargeAmount(new BigDecimal(charge.getAmount()))
                .build());
    }


    /**
     * This method saves shipping details and turns the guest flag to on.
     *
     * @param guestOrderID Auto generated value
     * @throws GuestException is thrown when saving shipping details is failed
     */
    public void saveShippingDetails(long guestOrderID) throws GuestException {
        ShippingDetails shippingDetails = new ShippingDetails(guestOrderID);
        shippingDetails.setGuest(true);
        try {
            shippingDetailsClient.postShipping(shippingDetails);
        } catch (Exception e) {
            throw new GuestException("Unable to save shipping details for guest", e);
        }
    }
}
