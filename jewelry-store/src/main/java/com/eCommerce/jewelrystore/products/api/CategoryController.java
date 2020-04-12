package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.service.CategoryService;
import com.eCommerce.jewelrystore.products.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {


    @Autowired
    CategoryService categoryService;

    Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @GetMapping("/getAll")
    public ResponseEntity<List<Category>> getCategories(){
        return  ResponseEntity.ok().body(categoryService.getCategories());
    }

    @GetMapping("/getByCategory/{categoryName}")
    public ResponseEntity<Category> getCategoryByName(@PathVariable String categoryName){
        Category category = categoryService.getCategoryByName(categoryName);
        if(category==null){
            logger.info("Category requested not found "+categoryName);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(category);
    }


    @PostMapping("/postCategory")
    public ResponseEntity<Category> postProduct(@RequestBody Category category){
        Category savedCategory = categoryService.saveCategory(category);
        if(savedCategory==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedCategory);
    }

    @PutMapping("/updateCategory")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category){
        Category savedCategory = categoryService.updateCategory(category);
        if(savedCategory==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedCategory);
    }

    @DeleteMapping("/deleteCategory/{categoryId}")
    public ResponseEntity<HttpStatus> deleteCategory(@PathVariable long categoryId){
        categoryService.deleteCategory(categoryId);
        return ResponseEntity.ok().build();
    }

}
