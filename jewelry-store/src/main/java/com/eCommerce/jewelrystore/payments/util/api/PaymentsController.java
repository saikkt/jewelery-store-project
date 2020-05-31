package com.eCommerce.jewelrystore.payments.util.api;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.adapter.CartClient;
import com.eCommerce.jewelrystore.adapter.CartClientImpl;
import com.eCommerce.jewelrystore.adapter.GuestOrderClient;
import com.eCommerce.jewelrystore.adapter.TransactionClient;
import com.eCommerce.jewelrystore.aws.secrets.stripe.StripeSecret;
import com.eCommerce.jewelrystore.customer.domain.Customer;
import com.eCommerce.jewelrystore.customer.repository.CustomerRepository;
import com.eCommerce.jewelrystore.customer.service.CustomerService;
import com.eCommerce.jewelrystore.customer.util.CartLoaderUtility;
import com.eCommerce.jewelrystore.email.util.MailSender;
import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import com.eCommerce.jewelrystore.guest.errorhandler.GuestException;
import com.eCommerce.jewelrystore.guest.model.GuestModel;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.service.OrderService;
import com.eCommerce.jewelrystore.payments.stripe.dto.ChargeRequest;
import com.eCommerce.jewelrystore.payments.stripe.service.StripeService;
import com.eCommerce.jewelrystore.payments.taxes.service.TaxService;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;
import com.eCommerce.jewelrystore.payments.util.PaymentUtil;
import com.eCommerce.jewelrystore.products.model.Coupon;
import com.eCommerce.jewelrystore.products.model.Discount;
import com.eCommerce.jewelrystore.products.service.CouponService;
import com.eCommerce.jewelrystore.products.service.DiscountService;
import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import com.eCommerce.jewelrystore.shipping.service.ShippingDetailsService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentsController {

    @Autowired
    StripeService paymentsService;

    @Autowired
    PaymentUtil paymentUtil;

    @Autowired
    CartLoaderUtility cartLoaderUtility;

    @Autowired
    OrderService orderService;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    ShippingDetailsService shippingDetailsService;

    @Autowired
    GuestOrderClient guestOrderClient;

    @Autowired
    TransactionClient transactionClient;

    @Autowired
    TaxService taxService;

    @Autowired
    StripeSecret stripeSecret;

    @Autowired
    CouponService couponService;

    @Autowired
    CustomerService customerService;

    @Autowired
    MailSender mailSender;

    @Autowired
    CartClient cartClient;

    Logger logger = LoggerFactory.getLogger(PaymentsController.class);

    //    @Value("${STRIPE_PUBLIC_KEY}")
//    private String stripePublicKey;

    @PostMapping("/charge")
    public ResponseEntity<HttpStatus> charge(@RequestBody ChargeRequest chargeRequest, Model model,HttpSession httpSession) throws StripeException, GuestException, TransactionException {

        chargeRequest.setDescription("Example charge");
        chargeRequest.setCurrency(ChargeRequest.Currency.USD);

        long customerId;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = null;

        if (principal instanceof UserDetails) {
            userDetails = (MyUserDetails) principal;
            Charge charge = null;
            //sending payment to stripe
            try {
                charge = paymentUtil.sendPayment(chargeRequest);
            } catch (StripeException exception) {
                logger.info("payment rejected by stripe for customer " + customerRepository.findById(userDetails.getCustomerId()).get().getEmailAddress());
            } catch (Exception ex) {
                logger.info("payment failed for customer " + customerRepository.findById(userDetails.getCustomerId()).get().getEmailAddress());
            }

            model.addAttribute("id", charge.getId());
            model.addAttribute("status", charge.getStatus());
            model.addAttribute("chargeId", charge.getId());
            model.addAttribute("balance_transaction", charge.getBalanceTransaction());

            customerId = userDetails.getCustomerId();

            //updating order
            Order customerOrders = orderService.getByCustomerIdInCart(customerId).get(0);
            customerOrders.setOrderStatus(OrderStatus.PLACED);
            orderService.updateOrder(customerOrders);

            //adding into shipping
            ShippingDetails shippingDetails = new ShippingDetails(customerOrders.getOrderID());
            shippingDetailsService.postShipping(shippingDetails);
            //adding into payment
            orderService.saveTransactionDetails(customerOrders.getOrderID(),charge);
            //emptying cart
            cartClient.emptyCart(httpSession);
            //logic left
            //send email for order confirmation
            Customer customer = customerService.get(customerId).get();
            mailSender.sendEmail(customer.getEmailAddress(),"Order Placed",customerOrders.toString());
            return ResponseEntity.ok().build();
        }

        //payment for guest user
        else {
            Charge charge = null;
            //sending payment to stripe
            try {
                charge = paymentUtil.sendPayment(chargeRequest);
            } catch (StripeException exception) {
                logger.info("payment rejected by stripe for guest", exception);
            } catch (Exception ex) {
                logger.info("payment failed for guest", ex);
            }
            //To do -- change charge status to enum
            if (charge.getStatus().equalsIgnoreCase("succeeded")) {
                model.addAttribute("id", charge.getId());
                model.addAttribute("status", charge.getStatus());
                model.addAttribute("chargeId", charge.getId());
                model.addAttribute("balance_transaction", charge.getBalanceTransaction());

                GuestModel guestModel = chargeRequest.getGuestModel();
                GuestOrder guestOrder = guestOrderClient.placeGuestOrder(guestModel, charge);
                //To do-- Try with Object Mapper...Use GuestModel instead of Guest


                /*Shipping Details,
                 Order Confirmation Email,
                  Transaction details are handled in guest order service*/

                return ResponseEntity.ok().build();
            }
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    /**
     * To-do:
     * Customer Order and Guest Order returns checkout price in $$. Figure out what Stripe payment takes amount in
     * cents or dollars.
     */
    @RequestMapping("/checkout")
    public ResponseEntity<Model> checkout(Model model, HttpSession httpSession, @RequestParam(name = "couponName") String couponName) throws GuestException {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long customerId;

        //If the context has logged in user
        if (principal instanceof UserDetails) {
            //getting customer details
            MyUserDetails userDetails = (MyUserDetails) principal;
            customerId = userDetails.getCustomerId();

            //loading updated cart into customer with 'CART' status
            cartLoaderUtility.loadCartToCustomer(httpSession);

            //refreshing order
            List<Order> customerOrders = orderService.getByCustomerIdInCartRefreshed(customerId);
            if (customerOrders.size() == 0)
                return ResponseEntity.noContent().build();
//            Order refreshedOrder = orderService.refreshOrder(customerOrders.get(0));
            Order refreshedOrder = customerOrders.get(0);

            Coupon coupon = null;
            //getting coupon if available
            if(couponName!=null && !couponName.trim().isEmpty()) {

                //getting coupon
                coupon = couponService.validateCoupon(couponName);
                //checking whether coupon is valid
                if (coupon==null || coupon.isValid() != true)
                    throw new RuntimeException();
                else
                    refreshedOrder = orderService.updateCouponInCartOrder(customerId, coupon);

                //checking whether the coupon used by customer is in applied limit
                List<Order> orders = orderService.getByCustomerNotInCart(customerId);

                long couponUsed = orders.stream().filter(order -> {
                    return couponName.equals(order.getCouponType());

                }).count();
                if (couponUsed >= coupon.getLimitPerCustomer())
                    throw new RuntimeException();
                

                model.addAttribute("couponAmount", coupon.getWorth());// in cents
            } else {
            	refreshedOrder.setCheckoutPrice(refreshedOrder.getTotalPrice());
            }

            //adding taxes to order
            BigDecimal amount = refreshedOrder.getCheckoutPrice();
            BigDecimal stateTax  = amount.multiply(taxService.getNewYorkStateTax().getPercentage().divide(BigDecimal.valueOf(100)));
            orderService.addTaxesToOrder(refreshedOrder,stateTax);

//          model.addAttribute("amount", amount);
          model.addAttribute("tax", stateTax);
          model.addAttribute("finalAmount", refreshedOrder.getCheckoutPrice());
          model.addAttribute("totalAmount", refreshedOrder.getTotalPrice());
          model.addAttribute("stripePublicKey", stripeSecret.getStripePublicKey());
          model.addAttribute("currency", ChargeRequest.Currency.USD);
            return ResponseEntity.ok().body(model);
        }
        //If the checkout is for guest
        else {

            GuestOrder guestOrder = guestOrderClient.getGuestOrderSummary();
            BigDecimal amount = guestOrder.getCheckoutPrice();
            BigDecimal stateTax  = amount.multiply(taxService.getNewYorkStateTax().getPercentage().divide(BigDecimal.valueOf(100)));
            model.addAttribute("amount", amount); // in cents
            model.addAttribute("tax", stateTax);// in cents
            model.addAttribute("total", amount.add(stateTax));
            model.addAttribute("stripePublicKey", stripeSecret.getStripePublicKey());
            model.addAttribute("currency", ChargeRequest.Currency.USD);
            return ResponseEntity.ok(model);
        }
        // return ResponseEntity.status(401).build();
    }

    @ExceptionHandler(StripeException.class)
    public String handleError(Model model, StripeException ex) {
        model.addAttribute("error", ex.getMessage());
        return "result";
    }
}
