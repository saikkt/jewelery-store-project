package com.eCommerce.jewelrystore.cart.service;

import com.eCommerce.jewelrystore.adapter.ProductClient;
import com.eCommerce.jewelrystore.cart.domain.CartItem;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Component
public class CartServiceImpl implements CartService {

    @Value("${cart.session.attribute.name}")
    private String cartSessionAttributeName;
    private ProductClient productClient;

    public CartServiceImpl(ProductClient productClient) {
        this.productClient = productClient;
    }

    //Auxiliary method to check if product id exists
    //To do -- change exception according to Product Entity
    public boolean isProductIDExists(long productID) throws Exception {
        if(!productClient.isProductIDExists(productID)){
            throw new Exception();
        }
        return productClient.isProductIDExists(productID);
    }

    @Override
    public List<CartItem> addItemToCart(long productID, int quantity, HttpSession session) throws Exception {

        //check if product id exists
        isProductIDExists(productID);


        if (session.getAttribute(cartSessionAttributeName) == null) {
            List<CartItem> cartItems = new ArrayList<>();
            cartItems.add(new CartItem(productID, quantity));
            session.setAttribute(cartSessionAttributeName, cartItems);
            return cartItems;
        }

        List<CartItem> cartItems = (List<CartItem>) session.getAttribute(cartSessionAttributeName);

        // Find if product already exists and update quantity
        final int index = findCartItemIndex(cartItems, productID);
        if (index != -1) {
            CartItem cartItem = cartItems.get(index);
            cartItem.setQuantity(quantity);
            cartItems.set(index,cartItem);
            return cartItems;
        }

        cartItems.add(new CartItem(productID, quantity));
        return cartItems;
    }

    @Override
    public List<CartItem> removeCartItem(long productID, HttpSession session) throws Exception {

        //check if product id exists
        if(!isProductIDExists(productID)) throw new Exception();

        List<CartItem> cartItems = (List<CartItem>) session.getAttribute(cartSessionAttributeName);
        final int index = findCartItemIndex(cartItems, productID);
        if (index != -1) {
            cartItems.remove(index);
            session.setAttribute(cartSessionAttributeName, cartItems);
            return cartItems;
        }
        return cartItems;
    }

    @Override
    public List<CartItem> getCart(HttpSession session) {
        return (List<CartItem>) session.getAttribute(cartSessionAttributeName);
    }


    public int findCartItemIndex(List<CartItem> cartItems, long productID) {
        if(cartItems!=null) {
            for (int i = 0; i < cartItems.size(); i++) {
                if (cartItems.get(i).getProductID() == productID)
                    return i;
            }
        }
        return -1;
    }

    @Override
    public void emptyCart(HttpSession session) {
        session.removeAttribute(cartSessionAttributeName);
    }
}
