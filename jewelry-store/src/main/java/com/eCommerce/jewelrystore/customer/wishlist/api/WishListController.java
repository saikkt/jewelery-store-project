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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
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

    //need to be added in production --  removed for testing purpose
    //@PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/getByLoggedUser")
    public ResponseEntity<WishListModel> getWishList(){
        WishList wishList = wishListService.getByLoggedInCustomerId();
        WishListModel wishListModel = new WishListModel();
        if(wishList!=null){
            wishListModel = WishListMapper.toModel(wishList);
            List<String> products = Arrays.asList(wishList.getProductsList().split("~"));
            List<Product> wishListProducts = new ArrayList<>();
            products.stream().forEach(p->{
                wishListProducts.add(productService.getByProductID(Integer.parseInt(p)));
            });
            wishListModel.setWishListProducts(wishListProducts);
        }
        return ResponseEntity.ok().body(wishListModel);
    }

    //need to be added in production --  removed for testing purpose
    //@PreAuthorize("hasRole('ROLE_USER')")
    @PostMapping("/postWishList")
    public ResponseEntity<WishListModel> postWishList(@RequestBody WishListModel wishListModel){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        long customerId = userDetails.getCustomerId();
        wishListModel.setCustomerID(customerId);
            WishList wishListMapped = WishListMapper.toNewDomain(wishListModel);
            WishList wishListSaved = wishListService.save(wishListMapped);
            return ResponseEntity.ok().body(WishListMapper.toModel(wishListSaved));

    }


    //need to be added in production --  removed for testing purpose
    //@PreAuthorize("hasRole('ROLE_USER')")
    @PutMapping("/updateWishList")
    public ResponseEntity<WishListModel> updateWishList(@RequestBody WishListModel wishListModel){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        long customerId = userDetails.getCustomerId();
        wishListModel.setCustomerID(customerId);
        WishList wishList = wishListService.getByLoggedInCustomerId();
        WishList wishListMapped = WishListMapper.merge(wishListModel,wishList);
        WishList wishListSaved = wishListService.update(wishListMapped);
        return ResponseEntity.ok().body(WishListMapper.toModel(wishListSaved));
    }

    
    //need to be added in production --  removed for testing purpose
    //@PreAuthorize("hasRole('ROLE_USER')")
    @DeleteMapping("/deleteWishList")
    public ResponseEntity<HttpStatus> deleteWishList(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        long customerId = userDetails.getCustomerId();
        wishListService.delete(customerId);
        return ResponseEntity.ok().build();
    }
    
    // Make nessessary changes for below methods, if needed
    // Added by seethend - start
    @PostMapping("/postWishListItem/{productId}")
    public ResponseEntity<WishListModel> postWishListItem(@PathVariable String productId){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        long customerId = userDetails.getCustomerId();
        
        WishList wishList = wishListService.getByLoggedInCustomerId();
        WishList wishListMapped = null;
        
        if(wishList == null)
        	wishListMapped = new WishList(customerId, productId + "~");
        else
        	wishListMapped = WishListMapper.mergeProduct(productId, wishList, customerId);
        
        WishList wishListSaved = wishListService.update(wishListMapped);
        
        WishListModel wishListModel = makeWishListModel(wishListSaved);
        
        return ResponseEntity.ok().body(wishListModel);
    }
    
    @DeleteMapping("/deleteWishListItem/{productId}")
    public ResponseEntity<WishListModel> deleteWishListItem(@PathVariable String productId){
    	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        MyUserDetails userDetails = (MyUserDetails) principal;
        long customerId = userDetails.getCustomerId();
        
        WishList wishList = wishListService.getByLoggedInCustomerId();
    	WishList wishListMapped = null;
        
        if(wishList == null)
        	wishListMapped = new WishList(customerId, productId + "~");
        else
        	wishListMapped = WishListMapper.removeProduct(productId, wishList, customerId);

        WishList wishListSaved = wishListService.update(wishListMapped);

        WishListModel wishListModel = makeWishListModel(wishListSaved);
        
        return ResponseEntity.ok().body(wishListModel);
    }
    
	private WishListModel makeWishListModel(WishList wishListSaved) {
		WishListModel wishListModel = WishListMapper.toModel(wishListSaved);
	    
	    List<String> products = Arrays.asList(wishListSaved.getProductsList().split("~"));
	    List<Product> wishListProducts = new ArrayList<>();
	    products.stream().forEach(p->{
	        wishListProducts.add(productService.getByProductID(Integer.parseInt(p)));
	    });
	    wishListModel.setWishListProducts(wishListProducts);
		return wishListModel;
	}

    // Added by seethend - end
}
