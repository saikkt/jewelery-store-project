package com.eCommerce.jewelrystore.landingpage.service;

import com.eCommerce.jewelrystore.adapter.*;
import com.eCommerce.jewelrystore.landingpage.domain.LandingPage;
import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.model.SubCategory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * To-do: Write limits in application properties
 */
@Component
//@Scope("prototype")
public class LandingPageBuilder {

    final private ProductClient productClient;
    final private SectionClient sectionClient;
    final private CategoryClient categoryClient;
    final private SubCategoryClient subCategoryClient;
    final private CollectionClient collectionClient;
    final private CarouselImageService carouselImageService;
    final private ComboService comboService;
    final private ObjectMapper objectMapper = new ObjectMapper();
    private LandingPage landingPage;

    public LandingPageBuilder(ProductClient productClient,
                              SectionClient sectionClient,
                              CategoryClient categoryClient,
                              SubCategoryClient subCategoryClient,
                              CollectionClient collectionClient, CarouselImageService carouselImageService, ComboService comboService) {
        this.productClient = productClient;
        this.sectionClient = sectionClient;
        this.categoryClient = categoryClient;
        this.subCategoryClient = subCategoryClient;
        this.collectionClient = collectionClient;
        this.carouselImageService = carouselImageService;
        this.comboService = comboService;
        landingPage = new LandingPage();
    }

    public LandingPageBuilder loadGlobalLists() {
        landingPage.setGlobalProductList(productClient.getAllProducts());
        landingPage.setGlobalSectionList(sectionClient.getAllSections());
        landingPage.setGlobalCategoryList(categoryClient.getAllCategories());
        landingPage.setGlobalSubCategory(subCategoryClient.getAllSubCategories());
        landingPage.setGlobalCollectionList(collectionClient.getAllCollections());
        return this;
    }

    //handles illegal state
    public void errorHandler() {
        if (landingPage.getGlobalSectionList() == null || landingPage.getGlobalCategoryList() == null ||
                landingPage.getGlobalProductList() == null || landingPage.getGlobalSubCategory() == null) {
            throw new IllegalStateException("Global lists not initialized");
        }
    }

    public LandingPageBuilder loadNavBarSectionsCategoryAndSubCategory() {
        this.errorHandler();
        landingPage.getGlobalSectionList().forEach(section -> {
            try {
                landingPage.getNavBar().put(objectMapper.writeValueAsString(section),
                        categorySubCategoryHelper(section));

            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });

        return this;
    }

    public HashMap<Object, List<SubCategory>> categorySubCategoryHelper(Section section) {
        HashMap<Object, List<SubCategory>> categoryAndSubCategory = new HashMap<>();
        landingPage.getGlobalCategoryList().forEach(category -> {
            if (checkIfSectionIsPresentInCategory(section.getSectionName(), category)) {
                try {
                    categoryAndSubCategory.put(objectMapper.writeValueAsString(category),
                            sectionWiseSubCategory(category, section.getSectionName()));
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

    public List<SubCategory> sectionWiseSubCategory(Category category, String sectionName) {
        if (sectionName.equalsIgnoreCase("mens")) {
            return subCategoryClient.getAllSubCategoriesByCategoryID(category.getCategoryID())
                    .stream()
                    .filter(SubCategory::isMenSection)
                    .collect(Collectors.toList());
        }
        if (sectionName.equalsIgnoreCase("womens")) {
            return subCategoryClient.getAllSubCategoriesByCategoryID(category.getCategoryID())
                    .stream()
                    .filter(SubCategory::isWomenSection)
                    .collect(Collectors.toList());
        }
        if (sectionName.equalsIgnoreCase("kids")) {
            return subCategoryClient.getAllSubCategoriesByCategoryID(category.getCategoryID())
                    .stream()
                    .filter(SubCategory::isKidsSection)
                    .collect(Collectors.toList());
        }
        return null;
    }


    public LandingPageBuilder setWelcomePageCarouselImages() {
        landingPage.setWelcomePageCarousel(carouselImageService.getAllCarouselImages());
        return this;
    }

    public LandingPageBuilder setNewArrivals() {
        this.errorHandler();
        landingPage.setNewArrivals(landingPage.getGlobalProductList()
                .stream()
                .sorted(new Comparator<Product>() {
                    @Override
                    public int compare(Product o1, Product o2) {
                        if (o1.getCreateDate() == null || o2.getCreateDate() == null) return 0;
                        return o2.getCreateDate().compareTo(o1.getCreateDate());
                    }
                }).limit(3)
                .collect(Collectors.toList())
        );

        return this;
    }

    //Currently Admin Choice...Fetch from orders and see performance
    public LandingPageBuilder setTopProducts() {
        this.errorHandler();
        // Get new arrivals and filter?????
        landingPage.setTopProducts(landingPage.getGlobalProductList()
                .stream()
                .filter(Product::isTopProduct)
                .limit(4)
                .collect(Collectors.toList())
        );
        return this;
    }

    //Currently admin choice....Fetch from orders and see performance
    public LandingPageBuilder setBestSellers() {
        this.errorHandler();
        //Get New Arrivals and filter?????
        landingPage.setBestSellers(landingPage.getGlobalProductList()
                .stream()
                .filter(Product::isBestSeller)
                .limit(4)
                .collect(Collectors.toList())
        );
        return this;
    }

    //Max 2 Combos
    public LandingPageBuilder setCombos() {
        //Sort Combo IDs in desc order to get latest combos and limit to 2
        landingPage.setCombos(comboService.getAllCombos()
                .stream()
                .sorted((c1, c2) -> Long.compare(c2.getComboID(), c1.getComboID()))
                .limit(2)
                .collect(Collectors.toList()));
        return this;
    }

    //Max 3 Popular Categories
    public LandingPageBuilder setPopularCategories() {
        landingPage.setPopularCategory(landingPage.getGlobalCategoryList()
                .stream()
                .filter(Category::isPopular)
                .limit(4)
                .collect(Collectors.toList()));
        return this;
    }

    public LandingPage build() {
        return this.landingPage;
    }
}
