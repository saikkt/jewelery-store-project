package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.service.CategoryService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryClientImpl implements CategoryClient {


    private CategoryService categoryService;

    public CategoryClientImpl(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryService.getCategories();
    }
}
