package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.SubCategory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SubCategoryClient {

    List<SubCategory> getAllSubCategoriesByCategoryID(long categoryID);
    List<SubCategory> getAllSubCategories();
}
