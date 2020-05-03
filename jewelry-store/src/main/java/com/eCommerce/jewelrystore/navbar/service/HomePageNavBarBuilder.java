package com.eCommerce.jewelrystore.navbar.service;

import com.eCommerce.jewelrystore.adapter.CategoryClient;
import com.eCommerce.jewelrystore.adapter.SectionClient;
import com.eCommerce.jewelrystore.adapter.SubCategoryClient;
import com.eCommerce.jewelrystore.navbar.domain.HomePageNavBar;
import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.model.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class HomePageNavBarBuilder {

    @Autowired
    private SectionClient sectionClient;
    @Autowired
    private CategoryClient categoryClient;
    @Autowired
    private SubCategoryClient subCategoryClient;
    private HomePageNavBar homePageNavBar;

    public HomePageNavBarBuilder() {
        homePageNavBar = new HomePageNavBar();
    }

    public HomePageNavBarBuilder setSection() {
//        sectionClient.getAllSections().forEach(
//                section -> homePageNavBar.getSectionCategorySubCategoryHashMap()
//                        .put(section, new HashMap<Category, List<SubCategory>>()));

        return this;
    }

    public HomePageNavBarBuilder setCategoriesAndSubCategories() {
//        categoryClient.getAllCategories().forEach(category -> {
//            homePageNavBar.getSectionCategorySubCategoryHashMap().forEach(
//                    (section, categoryListHashMap) -> {
//                        categoryListHashMap.put(category,
//                                subCategoryClient.getAllSubCategoriesByCategoryID(
//                                        category.getCategoryID()
//                                ));
//                    });
//        });
        return this;
    }

    public HomePageNavBar build(){
        return this.homePageNavBar;
    }
}
