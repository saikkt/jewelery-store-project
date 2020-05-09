package com.eCommerce.jewelrystore.cart.service;

import com.eCommerce.jewelrystore.adapter.ProductClient;
import com.eCommerce.jewelrystore.cart.domain.CartItem;
import com.eCommerce.jewelrystore.products.exceptions.ProductOutOfStockException;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Component
public class CartServiceImpl implements CartService {


    private String cartSessionAttributeName;
    private ProductClient productClient;
    private ProductService productService;

    public CartServiceImpl(@Value("${cart.session.attribute.name}") String cartSessionAttributeName,
                           ProductClient productClient,ProductService productService) {
        this.cartSessionAttributeName = cartSessionAttributeName;
        this.productClient = productClient;
        this.productService=productService;
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
        Product product =  productService.getByProductID(productID);

        if (session.getAttribute(cartSessionAttributeName) == null) {
            List<CartItem> cartItems = new ArrayList<>();
            if(product.getInStockQuantity()<quantity)
                throw new ProductOutOfStockException("Product stock limit reached "+product.getProductName());
            cartItems.add(new CartItem(productID, quantity,product));
            session.setAttribute(cartSessionAttributeName, cartItems);
            return cartItems;
        }

        List<CartItem> cartItems = getCart(session);


        // Find if product already exists and update quantity
        final int index = findCartItemIndex(cartItems, productID);
        if (index != -1) {
            CartItem cartItem = cartItems.get(index);
            if((product.getInStockQuantity()+cartItem.getQuantity())<quantity)
                throw new ProductOutOfStockException("Product stock limit reached "+product.getProductName());
            cartItem.setQuantity(quantity+cartItem.getQuantity());
            cartItems.set(index,cartItem);
            return cartItems;
        }

        if(product.getInStockQuantity()<quantity)
            throw new ProductOutOfStockException("Product stock limit reached "+product.getProductName());
        cartItems.add(new CartItem(productID, quantity,productService.getByProductID(productID)));
        return cartItems;
    }

    @Override
    public List<CartItem> removeCartItem(long productID, HttpSession session) throws Exception {

        //check if product id exists
        if(!isProductIDExists(productID)) throw new Exception();

        List<CartItem> cartItems =getCart(session);
        final int index = findCartItemIndex(cartItems, productID);
        if (index != -1) {
            cartItems.remove(index);
            session.setAttribute(cartSessionAttributeName, cartItems);
            return cartItems;
        }
        return cartItems;
    }


    @Override
    public List<CartItem> updateCartItem(long productID, HttpSession session,int quantity) throws Exception {

        //check if product id exists
        if(!isProductIDExists(productID)) throw new Exception();

        Product product =  productService.getByProductID(productID);
        List<CartItem> cartItems = (List<CartItem>) session.getAttribute(cartSessionAttributeName);
        final int index = findCartItemIndex(cartItems, productID);
        if (index != -1) {
            int quantity_available = cartItems.get(index).getQuantity();
            if(quantity_available<quantity)
                throw new ProductOutOfStockException("Product stock limit reached "+product.getProductName());
            cartItems.get(index).setQuantity(quantity);
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

    @Override
    public List<CartItem> updateCart(List<CartItem> cartItems,HttpSession session) {
        cartItems.stream().forEach(p->{
            try {
                addItemToCart(p.getProductID(),p.getQuantity(),session);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        return (List<CartItem>) session.getAttribute(cartSessionAttributeName);
    }
}
