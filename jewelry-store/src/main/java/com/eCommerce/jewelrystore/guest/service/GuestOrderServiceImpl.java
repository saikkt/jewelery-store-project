package com.eCommerce.jewelrystore.guest.service;

import com.eCommerce.jewelrystore.adapter.CartClient;
import com.eCommerce.jewelrystore.adapter.ProductClient;
import com.eCommerce.jewelrystore.email.util.MailSender;
import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.domain.GuestOrderItem;
import com.eCommerce.jewelrystore.guest.domain.OrderStatus;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.repository.GuestOrderItemRepository;
import com.eCommerce.jewelrystore.guest.repository.GuestOrderRepository;
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

@Component
public class GuestOrderServiceImpl implements GuestOrderService {

    private String cartSessionAttributeName;
    private GuestOrderRepository guestOrderRepository;
    private GuestOrderItemRepository guestOrderItemRepository;
    private GuestService guestService;
    private CartClient cartClient;
    private HttpSession httpSession;
    private ProductClient productClient;
    private MailSender mailSender;
    Logger logger = LoggerFactory.getLogger(GuestOrderServiceImpl.class);

    public GuestOrderServiceImpl(@Value("${cart.session.attribute.name}") String cartSessionAttributeName,
                                 GuestOrderRepository guestOrderRepository,
                                 GuestOrderItemRepository guestOrderItemRepository,
                                 GuestService guestService,
                                 CartClient cartClient,
                                 HttpSession httpSession,
                                 ProductClient productClient,
                                 MailSender mailSender) {
        this.cartSessionAttributeName = cartSessionAttributeName;
        this.guestOrderRepository = guestOrderRepository;
        this.guestOrderItemRepository = guestOrderItemRepository;
        this.guestService = guestService;
        this.cartClient = cartClient;
        this.httpSession = httpSession;
        this.productClient = productClient;
        this.mailSender = mailSender;
    }

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

    //To do-- Multiple data base operations. Optimize
    @Transactional
    public GuestOrder saveGuestOrderAndItems(Guest guest) throws GuestException {
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
            if (savedGuest != null) guestOrder.setGuestID(savedGuest.getGuestID());
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
            CompletableFuture.runAsync(()->{
                sendOrderConfirmationEmail(savedGuestOrder.getGuestOrderNumber().toString());
            });



            //Clear cart session
            httpSession.removeAttribute(cartSessionAttributeName);
        } catch (Exception e) {
            logger.warn("Unable to place guest order");
            throw new GuestException("Unable to place guest order", e);
        }
        return savedGuestOrder;
    }


    public void sendOrderConfirmationEmail(String orderNumber){
        mailSender.sendEmail("sai.kkt@gmail.com","Order-Placed",
                "Order tracking Number"+orderNumber);
    }
}
