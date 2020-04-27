package com.eCommerce.jewelrystore.cart.api;

import com.eCommerce.jewelrystore.cart.domain.CartItem;
import com.eCommerce.jewelrystore.cart.service.CartService;
import io.swagger.annotations.Api;
import org.springframework.data.annotation.Version;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/get-cart")
    public ResponseEntity<List<CartItem>> getAllCartItems(HttpSession session) {
        return ResponseEntity.ok(cartService.getCart(session));
    }

    @PostMapping("/add-to-cart/{productID}/{quantity}")
    public ResponseEntity<List<CartItem>> addToCart(@PathVariable(name = "productID") long productID,
                                                    @PathVariable(name = "quantity") int quantity,
                                                    HttpSession session) throws Exception {
        return ResponseEntity.ok(cartService.addItemToCart(productID, quantity, session));
    }

    @DeleteMapping("/delete-cart-item/{productID}")
    public ResponseEntity<List<CartItem>> deleteCartItem(@PathVariable(name = "productID") long productID,
                                                         HttpSession session) throws Exception {
        cartService.removeCartItem(productID, session);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/decrease-cart-item/{productID}/{quantity}")
    public ResponseEntity<List<CartItem>> decreaseCartItem(@PathVariable(name = "productID") long productID,
                                                           @PathVariable(name = "quantity") int quantity,
                                                         HttpSession session) throws Exception {
        cartService.decreaseCartItem(productID, session,quantity);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/empty-cart")
    public ResponseEntity<List<CartItem>> emptyCart(HttpSession session) {
        cartService.emptyCart(session);
        return ResponseEntity.ok().build();
    }


}
