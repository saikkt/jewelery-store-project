package com.eCommerce.jewelrystore.customer.wishlist.api;

import com.eCommerce.jewelrystore.accounts.models.MyUserDetails;
import com.eCommerce.jewelrystore.customer.wishlist.domain.WishList;
import com.eCommerce.jewelrystore.customer.wishlist.model.WishListModel;
import com.eCommerce.jewelrystore.customer.wishlist.service.WishListService;
import com.eCommerce.jewelrystore.order.domain.Order;
import com.eCommerce.jewelrystore.order.domain.OrderItem;
import com.eCommerce.jewelrystore.order.service.OrderService;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.service.ProductService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/wishlist")
public class WishListController {

    @Autowired
    private WishListService wishListService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @GetMapping("/getByLoggedUser")
    public ResponseEntity<WishListModel> getWishList(){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        long customerId = userDetails.getCustomerId();
        WishList wishList = wishListService.getByCustomerId(customerId);
        WishListModel wishListModel = WishListMapper.toModel(wishList);
        if(wishListModel.getWishListCount()>0){
            List<String> products = Arrays.asList(wishList.getProductsList().split("~"));
            List<Product> wishListProducts = new ArrayList<>();
            products.stream().forEach(p->{
               wishListProducts.add(productService.getByProductID(Integer.parseInt(p)));
            });
            wishListModel.setWishListProducts(wishListProducts);
        }
        List<Order> orders = orderService.getByCustomerIdInCart(customerId);
        if(orders.size()!=0) {
            List<OrderItem> orderItems =orders.get(0).getOrderItems();
            wishListModel.setCartListCount(orderItems.size());
            wishListModel.setCartListProducts(orderItems.stream().map(p -> {
                return productService.getByProductID(p.getProductID());
            }).collect(Collectors.toList()));
        }
        return ResponseEntity.ok().body(wishListModel);
    }
}
