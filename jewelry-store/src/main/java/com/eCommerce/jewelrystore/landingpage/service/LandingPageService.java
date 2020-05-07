/*
  ToDo: Discuss if boolean data needs to send in category to reduce payload.
  ToDo: Write a builder to build global object
 */
package com.eCommerce.jewelrystore.landingpage.service;

import com.eCommerce.jewelrystore.landingpage.domain.LandingPage;
import org.springframework.stereotype.Service;

@Service
public class LandingPageService {

    final private LandingPageBuilder landingPageBuilder;

    public LandingPageService(LandingPageBuilder landingPageBuilder) {
        this.landingPageBuilder = landingPageBuilder;
    }

    //Accessing Other Methods without loading global lists results in Illegal State Exception
    public LandingPage getHomePageNavBar() {
        return landingPageBuilder
                .loadGlobalLists()
                .loadNavBarSectionsCategoryAndSubCategory()
                .setWelcomePageCarouselImages()
                .setCombos()
                .setPopularCategories()
                .setNewArrivals()
                .setTopProducts()
                .setBestSellers()
                .build();
    }
}
