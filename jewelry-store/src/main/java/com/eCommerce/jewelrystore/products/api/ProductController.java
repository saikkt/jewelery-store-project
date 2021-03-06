package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.aws.s3.util.AmazonClient;
import com.eCommerce.jewelrystore.products.global.globalapi.ProductGlobalMapper;
import com.eCommerce.jewelrystore.products.global.globalmodel.ProductGlobalModel;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    AmazonClient amazonClient;

    @GetMapping("/getAll")
    public ResponseEntity<List<Product>> getProducts(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username="";
        System.out.println(principal instanceof UserDetails);

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

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/postProduct")
    public ResponseEntity<Product> postProduct(@RequestBody Product product,@RequestPart(value = "file") MultipartFile file){

        //setting product create and update date
        product.setCreateDate(Calendar.getInstance().getTime());
        product.setUpdateDate(Calendar.getInstance().getTime());

        //saving the products image to s3 bucket and setting the file name in imagepath
        product.setImagePath(amazonClient.uploadFile(file));

        Product savedProduct = productService.saveProduct(product);
        if(savedProduct==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedProduct);
    }

//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/postProductsList")
    public ResponseEntity<List<Product>> postProducts(@RequestBody List<Product> products){
        products.stream().forEach(product->{
            product.setCreateDate(Calendar.getInstance().getTime());
            product.setUpdateDate(Calendar.getInstance().getTime());
        });
        List<Product> savedProducts = productService.saveProducts(products);
        return ResponseEntity.ok().body(savedProducts);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/updateProduct")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
        product.setUpdateDate(Calendar.getInstance().getTime());
        Product savedProduct = productService.saveProduct(product);
        if(savedProduct==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedProduct);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PutMapping("/updateImage/{imageId}")
    public ResponseEntity<Product> updateImage(@PathVariable long imageId,@RequestPart(value = "file") MultipartFile file){
        Product product = productService.getByProductID(imageId);
        String deleteMsg = amazonClient.deleteFileFromS3Bucket(product.getImagePath());
        if(!deleteMsg.equals("Successfully deleted"))
            return ResponseEntity.notFound().build();
        product.setImagePath(amazonClient.uploadFile(file));
        Product savedProduct = productService.saveProduct(product);
        if(savedProduct==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedProduct);
    }

//    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/updateProductsList")
    public ResponseEntity<List<Product>> updateProductsList(@RequestBody List<Product> products){
        products.stream().forEach(product->{
            product.setUpdateDate(Calendar.getInstance().getTime());
        });
        List<Product> savedProducts = productService.saveProducts(products);
        return ResponseEntity.ok().body(savedProducts);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @DeleteMapping("/deleteProduct/{productId}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable long productId){
        Product product = productService.getByProductID(productId);
        String deleteMsg = amazonClient.deleteFileFromS3Bucket(product.getImagePath());
        if(!deleteMsg.equals("Successfully deleted"))
            return ResponseEntity.notFound().build();
         productService.deleteProduct(productId);
         return ResponseEntity.ok().build();
    }

    //Retrieving latest three Products created
    @GetMapping("/getLatestThreeProducts")
    public ResponseEntity<List<Product>> getLatestThreeProducts(){
        return  ResponseEntity.ok().body(productService.getLatestThreeProducts());
    }

    @GetMapping("/searchProductByKeyWord/{keyword}")
    public ResponseEntity<List<Product>> searchProductByKeyWord(@PathVariable String keyword){
       return ResponseEntity.ok().body(productService.searchProductByKeyWord(keyword));
    }

    @PostMapping("/getAllProductsPages/{a}/{b}")
    public ResponseEntity<ProductGlobalModel> getAllParoductsPagenated(@RequestBody ProductGlobalModel productGlobalModel,@PathVariable int a, @PathVariable int b){
        return ResponseEntity.ok().body(ProductGlobalMapper.toModel(new ProductGlobalModel(),productService.getAllProductsPageable(productGlobalModel,a,b)));
    }

    @PostMapping("/getAllProductsByFilters/{a}/{b}")
    public ResponseEntity<ProductGlobalModel> getAllProductsByFilters(@RequestBody ProductGlobalModel productGlobalModel,@PathVariable int a, @PathVariable int b){
        productGlobalModel.setResults(productService.getAllProductsPageable(productGlobalModel,a,b));
        return ResponseEntity.ok().body(productGlobalModel);
    }
}
