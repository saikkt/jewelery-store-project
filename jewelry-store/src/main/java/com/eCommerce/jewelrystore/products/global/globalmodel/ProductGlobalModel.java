package com.eCommerce.jewelrystore.products.global.globalmodel;


import com.eCommerce.jewelrystore.products.global.globalmodel.pricefilter.FacetFilter;

import java.util.*;

public class ProductGlobalModel {

    private HashMap<String,List<FacetFilter>> facets;
    private Object results;
    private List<FacetFilter> sortBy;

    public HashMap<String, List<FacetFilter>> getFacets() {
        return facets;
    }

    public void setFacets(HashMap<String, List<FacetFilter>> facets) {
        this.facets = facets;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }

    public List<FacetFilter> getSortBy() {
        return sortBy;
    }

    public void setSortBy(List<FacetFilter> sortBy) {
        this.sortBy = sortBy;
    }
}
