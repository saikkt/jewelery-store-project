package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Product>> getProducts(){
      return  ResponseEntity.ok().body(productService.getProducts());
    }

    @GetMapping("/getByCategory/{categoryName}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String categoryName){
        List<Product> products = productService.getProductByCategory(categoryName);
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/getByCollection/{collectionName}")
    public ResponseEntity<List<Product>> getProductsByCollection(@PathVariable String collectionName){
        List<Product> products = productService.getProductByCollection(collectionName);
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/getBySection/{sectionName}")
    public ResponseEntity<List<Product>> getProductsBySection(@PathVariable String sectionName){
        List<Product> products = productService.getProductBySection(sectionName);
        return ResponseEntity.ok().body(products);
    }

    @PostMapping("/postProduct")
    public ResponseEntity<Product> postProduct(@RequestBody Product product){
        Product savedProduct = productService.saveProduct(product);
        if(savedProduct==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedProduct);
    }

    @PostMapping("/postProductsList")
    public ResponseEntity<List<Product>> postProducts(@RequestBody List<Product> products){

        List<Product> savedProducts = productService.saveProducts(products);
        return ResponseEntity.ok().body(savedProducts);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        Product savedProduct = productService.saveProduct(product);
        if(savedProduct==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedProduct);
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable long productId){
         productService.deleteProduct(productId);
         return ResponseEntity.ok().build();
    }

}