package com.eCommerce.jewelrystore.order.service;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.adapter.DiscountClient;
import com.eCommerce.jewelrystore.adapter.ProductClient;
import com.eCommerce.jewelrystore.adapter.TransactionClient;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.domain.OrderStatus;
import com.eCommerce.jewelrystore.order.repository.OrderRepository;
import com.eCommerce.jewelrystore.payments.transaction.errorhandler.TransactionException;
import com.eCommerce.jewelrystore.products.model.Coupon;
import com.eCommerce.jewelrystore.products.model.Discount;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.service.ProductService;
import com.stripe.model.Charge;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    private OrderRepository orderRepository;
    private ProductClient productClient;
    private ProductService productService;
    private DiscountClient discountClient;
    private TransactionClient transactionClient;

    public OrderService(OrderRepository orderRepository, ProductClient productClient,ProductService productService, DiscountClient discountClient,TransactionClient transactionClient) {
        this.orderRepository = orderRepository;
        this.productClient = productClient;
        this.productService = productService;
        this.discountClient = discountClient;
        this.transactionClient = transactionClient;
    }

    public List<Order> getAll(int page, int size) {
        return orderRepository.findAll(PageRequest.of(page, size)).toList();
    }

    public List<Order> getByCustomerID(long customerID) {
        return orderRepository.findByCustomerID(customerID);
    }

    public Order save(Order order) {
        //Set Order
        //Get Unit Price
        //Calculate Total price
        //Get Discount from discount table
        //******To Do******
        //Get Tax From tax table (Not Sure How tax is calculated. Either for individual product or total price)

        order.getOrderItems().stream()
                .forEach(orderItem -> {
                    orderItem.setOrder(order);
                    BigDecimal discountPrice = orderItem.getUnitPrice().subtract(orderItem.getDiscount());
                    orderItem.setTotalPrice(discountPrice.multiply(new BigDecimal(orderItem.getQuantity())));
                });
        //CalcFasak123ulate CheckOut Price
        BigDecimal totalPrice = order.getOrderItems().stream()
                .map(OrderItem::getTotalPrice)
                .reduce(new BigDecimal(0), BigDecimal::add);
        //Set Checkout price
        order.setTotalPrice(totalPrice);
        return orderRepository.save(order);
    }


    public Order addToCart(long productID,int quantity){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = null;
        userDetails = (MyUserDetails) principal;
        List<Order> order_list = getByCustomerIdInCart(userDetails.getCustomerId());
        Order order = null;
        if(order_list.size()!=0)
             order = order_list.get(0);
        if(order==null)
        {
            Order order_new = new Order(userDetails.getCustomerId());
            Product product = productClient.getProductByID(productID);
            OrderItem orderItem = new OrderItem(order_new,product.getProductName());
            orderItem.setQuantity(quantity);
            orderItem.setUnitPrice(product.getPrice());
            Discount discount = discountClient.getDiscountByID(product.getDiscountID());
            if(discount.getPercentage().intValue()!=0){
                orderItem.setDiscount(discount.getPercentage().divide(BigDecimal.valueOf(100)).multiply(orderItem.getUnitPrice()));
            }
//            else if(discount.getWorth().intValue()!=0){
//                if(discount.getWorth().intValue()-orderItem.getUnitPrice().intValue()>=0)
//                    orderItem.setDiscount(orderItem.getUnitPrice());
//                orderItem.setDiscount(discount.getWorth());
//            }
            else{
                orderItem.setDiscount(BigDecimal.ZERO);
            }
            List<OrderItem> orderItemsList = new ArrayList<>();
            orderItemsList.add(orderItem);
            order_new.setOrderItems(orderItemsList);
            return save(order_new);
        }
        else
        {
            Product product = productClient.getProductByID(productID);
            OrderItem orderItem = new OrderItem(order,product.getProductName());
            orderItem.setQuantity(quantity);
            orderItem.setUnitPrice(product.getPrice());
            Discount discount = discountClient.getDiscountByID(product.getDiscountID());
            if(discount.getPercentage().intValue()!=0){
                orderItem.setDiscount(discount.getPercentage().divide(BigDecimal.valueOf(100)).multiply(orderItem.getUnitPrice()));
            }
//            else if(discount.getWorth().intValue()!=0){
//                if(discount.getWorth().intValue()-orderItem.getUnitPrice().intValue()>=0)
//                    orderItem.setDiscount(orderItem.getUnitPrice());
//                orderItem.setDiscount(discount.getWorth());
//            }
            else{
                orderItem.setDiscount(BigDecimal.ZERO);
            }
            order.getOrderItems().add(orderItem);
            return save(order);
        }
    }

    public Order refreshOrder(Order order){
        order.getOrderItems().stream().forEach(orderItem -> {
                refreshOrderItem(orderItem);
        });
        return save(order);
    }

    public void refreshOrderItem(OrderItem orderItem){
        Product product = productClient.getProductByName(orderItem.getProductName());
        orderItem.setUnitPrice(product.getPrice());
        Discount discount = discountClient.getDiscountByID(product.getDiscountID());
        if(discount.getPercentage().intValue()!=0){
            orderItem.setDiscount(discount.getPercentage().divide(BigDecimal.valueOf(100)).multiply(orderItem.getUnitPrice()));
        }
        else{
            orderItem.setDiscount(BigDecimal.ZERO);
        }
//        if(orderItem.getCouponWorth().intValue()!=0){
//            Coupon coupon = .getDiscountByID(orderItem.getCouponType());
//            if(coupon==null)
//                orderItem.(BigDecimal.ZERO);
//            orderItem.setWorth(coupon.getWorth());
//        }
//        else
//        {
//            orderItem.setWorth(BigDecimal.ZERO);
//        }
        return;
    }

    public Order updateOrder(Order order){
       return orderRepository.save(order);
    }


    public Optional<Order> getByOrderID(long orderID) {
        return orderRepository.findById(orderID);
    }

    public void deleteByOrderID(long orderID) {
        orderRepository.deleteById(orderID);
    }

    public List<Order> findByOrderStatus(OrderStatus orderStatus) {
        return orderRepository.findByOrderStatus(orderStatus);
    }


    public List<Order> getByCustomerIdInCart(long customerId) {
        return orderRepository.findByCustomerIDCartStatus(customerId);
    }

    public List<Order> getByCustomerIdInCartRefreshed(long customerId) {
        List<Order> orders = orderRepository.findByCustomerIDCartStatus(customerId);
        if(orders.size()==0)
            return new ArrayList<>();
        List<Order> ordersRefreshed = new ArrayList();
        ordersRefreshed.add(refreshOrder(orders.get(0)));
        return ordersRefreshed;
    }

    public Order deleteFromCart(long customerID,long productID,int quantity) {
        Order order = getByCustomerIdInCart(customerID).get(0);
        Product product = productClient.getProductByID(productID);
        //considering front end restricts the condition quantity>getQuantity()
        order.getOrderItems().stream().forEach(orderItem->{
            if(orderItem.getProductName()==product.getProductName()){
                orderItem.setQuantity(orderItem.getQuantity()-quantity);
            }
        });

        //saving back order
       return  save(order);
    }

    public Order updateCouponInCartOrder(long customerID,Coupon coupon){
        Order order = getByCustomerIdInCart(customerID).get(0);
        order.setCouponType(coupon.getCouponType());
        order.setCouponWorth(coupon.getWorth());
        BigDecimal effectivePrice = order.getTotalPrice().subtract(order.getCouponWorth());
        order.setCheckoutPrice(effectivePrice);
        return orderRepository.save(order);
    }

    public void addTaxesToOrder(Order refreshedOrder,BigDecimal tax) {
        refreshedOrder.setCheckoutPrice(refreshedOrder.getCheckoutPrice().add(tax));
        orderRepository.save(refreshedOrder);
    }

    /**
     * This method saves transaction details
     *
     * @param orderID Auto generated value
     * @param charge       receive from payment service
     * @throws TransactionException is thrown when saving transaction details is failed
     */
    public void saveTransactionDetails(long orderID, Charge charge) throws TransactionException {
        transactionClient.saveTransaction(transactionClient.getTransactionBuilder()
                .setGuestOrderID(orderID)
                .setChargeID(charge.getId())
                .setChargeAmount(new BigDecimal(charge.getAmount()))
                .build());
    }
}
