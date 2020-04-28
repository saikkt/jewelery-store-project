package com.eCommerce.jewelrystore.payments.util.api;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.customer.repository.CustomerRepository;
import com.eCommerce.jewelrystore.customer.util.CartLoaderUtility;
import com.eCommerce.jewelrystore.guest.domain.Guest;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.service.OrderService;
import com.eCommerce.jewelrystore.payments.stripe.dto.ChargeRequest;
import com.eCommerce.jewelrystore.payments.stripe.service.StripeService;
import com.eCommerce.jewelrystore.payments.util.PaymentUtil;
import com.eCommerce.jewelrystore.products.api.CategoryController;
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

    Logger logger = LoggerFactory.getLogger(PaymentsController.class);

    //    @Value("${STRIPE_PUBLIC_KEY}")
//    private String stripePublicKey;

    @PostMapping("/charge")
    public ResponseEntity<HttpStatus> charge(ChargeRequest chargeRequest, Model model, @RequestBody Guest guest) throws StripeException {

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
                logger.info("payment rejected by stripe for customer "+customerRepository.findById(userDetails.getCustomerId()).get().getEmailAddress());
            }
            catch (Exception ex){
                logger.info("payment failed for customer "+customerRepository.findById(userDetails.getCustomerId()).get().getEmailAddress());
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
            ShippingDetails shippingDetails=new ShippingDetails(customerOrders.getOrderID());
            shippingDetailsService.postShipping(shippingDetails);

            //adding into payment
            //logic left

            //send email for order confirmation


            return ResponseEntity.ok().build();
        }

        //payment for guest user
        else{

        }
        return ResponseEntity.status(401).build();
    }

    @RequestMapping("/checkout")
    public ResponseEntity<Model> checkout(Model model, HttpSession httpSession) {

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long customerId;

        //If the context has logged in user
        if (principal instanceof UserDetails) {
            MyUserDetails userDetails = (MyUserDetails) principal;
            customerId = userDetails.getCustomerId();
            cartLoaderUtility.loadCartToCustomer(httpSession);
            List<Order> customerOrders = orderService.getByCustomerIdInCart(customerId);
            if(customerOrders.size()==0)
                return ResponseEntity.noContent().build();
            model.addAttribute("amount", customerOrders.get(0).getCheckoutPrice()); // in cents
            model.addAttribute("stripePublicKey", "pk_test_7XVj7rZoBH41H8SLaNekEnCk00XFj6ME1t");
            model.addAttribute("currency", ChargeRequest.Currency.USD);
            return ResponseEntity.ok().body(model);
        }

        //If the checkout is for guest
        else {

        }
        return ResponseEntity.status(401).build();
    }

    @ExceptionHandler(StripeException.class)
    public String handleError(Model model, StripeException ex) {
        model.addAttribute("error", ex.getMessage());
        return "result";
    }
}
