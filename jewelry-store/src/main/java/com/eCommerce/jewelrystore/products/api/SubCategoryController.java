package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.model.SubCategory;
import com.eCommerce.jewelrystore.products.service.SubCategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  To do -- Concrete implementation needed
 */

@RestController
@RequestMapping("/sub-categories")
public class SubCategoryController {

    private SubCategoryService subCategoryService;

    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }

    @GetMapping
    public ResponseEntity<List<SubCategory>> getAll(){
        return ResponseEntity.ok(subCategoryService.getAll());
    }
    
    @PostMapping("/postSubCategories")
    public ResponseEntity<List<SubCategory>> postSubCategories(@RequestBody List<SubCategory> subCategories){
    	List<SubCategory> savedSubCategories = subCategoryService.saveSubCategories(subCategories);
        if(savedSubCategories==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedSubCategories);
    }
}
