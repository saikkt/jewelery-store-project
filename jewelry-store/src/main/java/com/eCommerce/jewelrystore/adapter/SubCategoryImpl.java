package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.SubCategory;
import com.eCommerce.jewelrystore.products.service.SubCategoryService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubCategoryImpl implements SubCategoryClient {

    private SubCategoryService subCategoryService;

    public SubCategoryImpl(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }

    @Override
    public List<SubCategory> getAllSubCategoriesByCategoryID(long categoryID) {
        return subCategoryService.getByCategoryID(categoryID);
    }

    @Override
    public List<SubCategory> getAllSubCategories() {
        return subCategoryService.getAll();
    }
}
