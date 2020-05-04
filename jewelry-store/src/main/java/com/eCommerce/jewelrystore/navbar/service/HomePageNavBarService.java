package com.eCommerce.jewelrystore.navbar.service;

import com.eCommerce.jewelrystore.adapter.CategoryClient;
import com.eCommerce.jewelrystore.adapter.SectionClient;
import com.eCommerce.jewelrystore.adapter.SubCategoryClient;
import com.eCommerce.jewelrystore.navbar.domain.HomePageNavBar;
import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.model.SubCategory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class HomePageNavBarService {


    final private SectionClient sectionClient;
    final private CategoryClient categoryClient;
    final private SubCategoryClient subCategoryClient;
    final private ObjectMapper objectMapper = new ObjectMapper();

    public HomePageNavBarService(SectionClient sectionClient, CategoryClient categoryClient, SubCategoryClient subCategoryClient) {
        this.sectionClient = sectionClient;
        this.categoryClient = categoryClient;
        this.subCategoryClient = subCategoryClient;
        // objectMapper.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES,false);
        // objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES,true);
    }

    public HomePageNavBar getHomePageNavBar() {
        HomePageNavBar homePageNavBar = new HomePageNavBar();
        //categoryClient.getAllCategories().stream()

        sectionClient.getAllSections().forEach(section -> {
            try {
                homePageNavBar.getNavBar().put(objectMapper.writeValueAsString(section),
                        categorySubCategoryHelper(section));

            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });




        return homePageNavBar;
    }

    public HashMap<Object,List<SubCategory>> categorySubCategoryHelper(Section section){
        HashMap<Object,List<SubCategory>> categoryAndSubCategory = new HashMap<>();
        categoryClient.getAllCategories().forEach(category -> {
            if(checkIfSectionIsPresentInCategory(section.getSectionName(),category)){
                try {
                    categoryAndSubCategory.put(objectMapper.writeValueAsString(category),
                            subCategoryClient.getAllSubCategoriesByCategoryID(category.getCategoryID()));
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
        });
        return categoryAndSubCategory;
    }

    public boolean checkIfSectionIsPresentInCategory(String sectionName, Category category) {
        if (sectionName.equalsIgnoreCase("mens"))
            return category.isMenSection();
        if (sectionName.equalsIgnoreCase("womens"))
            return category.isWomenSection();
        if (sectionName.equalsIgnoreCase("kids"))
            return category.isKidsSection();

        return false;
    }
}
