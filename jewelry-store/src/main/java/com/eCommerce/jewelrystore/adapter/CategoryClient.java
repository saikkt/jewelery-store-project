package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryClient {

    List<Category> getAllCategories();
}
