package com.eCommerce.jewelrystore.landingpage.domain;

import com.eCommerce.jewelrystore.products.model.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.HashMap;
import java.util.List;

@JsonSerialize
public class LandingPage {
    @JsonProperty
    private HashMap<Object, Object> navBar = new HashMap<>();

    @JsonProperty
    private List<CarouselImage> welcomePageCarousel;

    @JsonProperty
    private List<Category> popularCategories;

    @JsonProperty
    private List<Combo> combos;

    @JsonProperty
    private List<Product> newArrivals;

    @JsonProperty
    private List<Product> topProducts;

    @JsonProperty
    private List<Product> bestSellers;

    @JsonIgnore
    private List<Product> globalProductList;

    @JsonProperty
    private List<Section> globalSectionList;

    @JsonProperty
    private List<Category> globalCategoryList;

    @JsonProperty
    private List<SubCategory> globalSubCategory;

    @JsonProperty
    private List<Collection> globalCollectionList;


    public HashMap<Object, Object> getNavBar() {
        return navBar;
    }

    public void setNavBar(HashMap<Object, Object> navBar) {
        this.navBar = navBar;
    }

    public List<CarouselImage> getWelcomePageCarousel() {
        return welcomePageCarousel;
    }

    public void setWelcomePageCarousel(List<CarouselImage> welcomePageCarousel) {
        this.welcomePageCarousel = welcomePageCarousel;
    }

    public List<Category> getPopularCategory() {
        return popularCategories;
    }

    public void setPopularCategory(List<Category> popularCategories) {
        this.popularCategories = popularCategories;
    }

    public List<Product> getNewArrivals() {
        return newArrivals;
    }

    public void setNewArrivals(List<Product> newArrivals) {
        this.newArrivals = newArrivals;
    }

    public List<Product> getGlobalProductList() {
        return globalProductList;
    }

    public void setGlobalProductList(List<Product> globalProductList) {
        this.globalProductList = globalProductList;
    }

    public List<Combo> getCombos() {
        return combos;
    }

    public void setCombos(List<Combo> combos) {
        this.combos = combos;
    }

    public List<Product> getTopProducts() {
        return topProducts;
    }

    public void setTopProducts(List<Product> topProducts) {
        this.topProducts = topProducts;
    }

    public List<Product> getBestSellers() {
        return bestSellers;
    }

    public void setBestSellers(List<Product> bestSellers) {
        this.bestSellers = bestSellers;
    }

    public List<Section> getGlobalSectionList() {
        return globalSectionList;
    }

    public void setGlobalSectionList(List<Section> globalSectionList) {
        this.globalSectionList = globalSectionList;
    }

    public List<Category> getGlobalCategoryList() {
        return globalCategoryList;
    }

    public void setGlobalCategoryList(List<Category> globalCategoryList) {
        this.globalCategoryList = globalCategoryList;
    }

    public List<SubCategory> getGlobalSubCategory() {
        return globalSubCategory;
    }

    public void setGlobalSubCategory(List<SubCategory> globalSubCategory) {
        this.globalSubCategory = globalSubCategory;
    }

    public List<Collection> getGlobalCollectionList() {
        return globalCollectionList;
    }

    public void setGlobalCollectionList(List<Collection> globalCollectionList) {
        this.globalCollectionList = globalCollectionList;
    }
}
