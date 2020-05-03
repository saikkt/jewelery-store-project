package com.eCommerce.jewelrystore.navbar.domain;

import com.eCommerce.jewelrystore.products.model.Section;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.HashMap;

@JsonSerialize
public class HomePageNavBar {
    @JsonProperty
    private HashMap<Object,Object> navBar = new HashMap<>();


    public HashMap<Object, Object> getNavBar() {
        return navBar;
    }

    public void setNavBar(HashMap<Object, Object> navBar) {
        this.navBar = navBar;
    }
}
