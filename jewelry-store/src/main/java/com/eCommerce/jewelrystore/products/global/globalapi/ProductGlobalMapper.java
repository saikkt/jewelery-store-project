package com.eCommerce.jewelrystore.products.global.globalapi;

import com.eCommerce.jewelrystore.products.global.globalmodel.ProductGlobalModel;
import com.eCommerce.jewelrystore.products.model.Product;
import java.util.*;


import java.util.HashMap;

public class ProductGlobalMapper {

    public static ProductGlobalModel toModel(ProductGlobalModel modelReceived, List<Product> product){

        //setting results
        HashMap<String,Object> resultsMap = new HashMap<>();
        resultsMap.put("current_page",1);
        resultsMap.put("from",1);
        resultsMap.put("last_page",2);
        resultsMap.put("next_page_url","https://localhost:");
        resultsMap.put("data",product);
        modelReceived.setResults((Object) resultsMap);
        return modelReceived;
    }
}
