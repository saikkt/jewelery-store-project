package com.eCommerce.jewelrystore.guest.service;

import com.eCommerce.jewelrystore.adapter.*;
import com.eCommerce.jewelrystore.cart.domain.CartItem;
import com.eCommerce.jewelrystore.email.util.MailSender;
import com.eCommerce.jewelrystore.guest.api.GuestMapper;
import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.domain.GuestOrderItem;
import com.eCommerce.jewelrystore.guest.domain.OrderStatus;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.model.GuestModel;
import com.eCommerce.jewelrystore.guest.repository.GuestOrderItemRepository;
import com.eCommerce.jewelrystore.guest.repository.GuestOrderRepository;
import com.eCommerce.jewelrystore.payments.taxes.service.TaxService;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;
import com.eCommerce.jewelrystore.products.model.Coupon;
import com.eCommerce.jewelrystore.products.service.CouponService;
import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import com.eCommerce.jewelrystore.shipping.errorhandler.ShippingDetailsException;
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
import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
@Component
public class GuestOrderServiceImpl implements GuestOrderService {

    private final String cartSessionAttributeName;
    private final GuestOrderRepository guestOrderRepository;
    private final GuestOrderItemRepository guestOrderItemRepository;
    private final GuestService guestService;
    private final TaxService taxService;
    private final CouponService couponService;
    private final CartClient cartClient;
    private final ShippingDetailsClient shippingDetailsClient;
    private final TransactionClient transactionClient;
    private final DiscountClient discountClient;
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
                                 TaxService taxService, CouponService couponService,
                                 CartClient cartClient,
                                 ShippingDetailsClient shippingDetailsClient,
                                 TransactionClient transactionClient,
                                 DiscountClient discountClient,
                                 HttpSession httpSession,
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
        this.taxService = taxService;
        this.couponService = couponService;
        this.cartClient = cartClient;
        this.shippingDetailsClient = shippingDetailsClient;
        this.transactionClient = transactionClient;
        this.discountClient = discountClient;
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
        //final HashMap<Long, Integer> cartItems;
        final List<CartItem> cartItems;
        GuestOrder guestOrder;
        try {
            cartItems = cartClient.getCartItemsWithProductEntity(httpSession);
            guestOrder = new GuestOrder();

            //generate order items using cart
            List<GuestOrderItem> guestOrderItems = new ArrayList<>();
            cartItems.forEach(cartItem -> guestOrderItems.add(new GuestOrderItem(cartItem.getProductID(), cartItem.getQuantity())));

            //handle taxes, discount, total price, unit price
            guestOrderItems.forEach(guestOrderItem -> {
                guestOrderItem.setUnitPrice(orderSummaryUnitPriceHelper(cartItems, guestOrderItem.getProductID()));
                guestOrderItem.setDiscount(guestOrderItem.getUnitPrice()
                        .multiply(productClient.getProductDiscount(guestOrderItem.getProductID())
                                .divide(BigDecimal.valueOf(100))));

                guestOrderItem.setTotalPrice(guestOrderItem.getUnitPrice()
                        .subtract(guestOrderItem.getDiscount())
                        .multiply(new BigDecimal(guestOrderItem.getQuantity())));
            });

            //Calculate CheckOut Price
            BigDecimal checkOutPriceWithOutTax = guestOrderItems.stream()
                    .map(GuestOrderItem::getTotalPrice)
                    .reduce(new BigDecimal(0), BigDecimal::add);
            guestOrder.setCheckoutPriceWithoutTax(checkOutPriceWithOutTax);

            BigDecimal stateTax = checkOutPriceWithOutTax.multiply(taxService.getNewYorkStateTax().getPercentage().divide(BigDecimal.valueOf(100)));
            guestOrder.setStateTax(stateTax);

            BigDecimal checkOutPriceWithTax = checkOutPriceWithOutTax.add(stateTax);
            guestOrder.setCheckoutPrice(checkOutPriceWithTax);
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

    public BigDecimal orderSummaryUnitPriceHelper(List<CartItem> cartItems, long productID) {
        CartItem cartItem = cartItems.stream()
                .filter(item -> item.getProductID() == productID)
                .findFirst()
                .orElse(null);

        return cartItem.getProduct().getPrice();
    }

    /**
     * This method is called upon successful payment by guest
     *
     * @param guestModel contains details of guest
     * @return GuestOrder
     * @throws GuestException is thrown when any event fails
     */
    @Transactional
    @Override
    public GuestOrder saveGuestOrderAndItems(GuestModel guestModel, Charge charge) throws GuestException {
        Guest guest = GuestMapper.toEntity(guestModel);
        Guest savedGuest;
        GuestOrder savedGuestOrder;
        List<GuestOrderItem> guestOrderItems;

        try {
            // Save Guest Details
            savedGuest = guestService.save(guest);

            // Generate Order Summary and Dump result into GuestOrder
            // Set all the fields to guest order
            GuestOrder tempGuestOrder = orderSummary();
            String couponName = null;
            if (httpSession.getAttribute("CouponName") != null) {
                couponName = (String) httpSession.getAttribute("CouponName");
            }
            GuestOrder guestOrder = validateAndSetCoupon(tempGuestOrder, couponName);
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
            sendOrderConfirmationEmail(savedGuest.getEmailAddress(),
                    savedGuestOrder.getGuestOrderNumber().toString());

            //save transaction details
            saveTransactionDetails(savedGuestOrder.getGuestOrderID(), charge);

            //save shipping details
            saveShippingDetails(savedGuestOrder.getGuestOrderID());


            //Clear cart session and coupon name
            httpSession.removeAttribute(cartSessionAttributeName);
            httpSession.removeAttribute("CouponName");
        } catch (NullPointerException e) {
            logger.warn("Unable to place guest order");
            throw new GuestException("Null pointer accessed, unable to place guest order", e);
        } catch (Exception e) {
            logger.warn("Unable to place guest order");
            throw new GuestException("Unable to place guest order", e);
        }
        return savedGuestOrder;
    }


    @Override
    public GuestOrder validateAndSetCoupon(GuestOrder guestOrder, String couponName) throws GuestException {
        Coupon coupon;
        if (couponName != null) {
            coupon = couponService.validateCoupon(couponName);
            httpSession.setAttribute("CouponName", couponName);
            if (coupon == null || !coupon.isValid()) {
                throw new GuestException("Coupon Validation Failed", new RuntimeException());
            } else {
                guestOrder.setCouponType(coupon.getCouponType());
                guestOrder.setCouponWorth(coupon.getWorth());
                guestOrder.setCheckoutPrice(guestOrder.getCheckoutPrice().subtract(coupon.getWorth()));
            }
        }
        return guestOrder;
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
     *
     * @param guestOrderID Auto generated value
     * @param charge       receive from payment service
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
    public void saveShippingDetails(long guestOrderID) throws ShippingDetailsException {
        ShippingDetails shippingDetails = new ShippingDetails(guestOrderID);
        shippingDetails.setGuest(true);
        shippingDetailsClient.postShipping(shippingDetails);
    }
}
