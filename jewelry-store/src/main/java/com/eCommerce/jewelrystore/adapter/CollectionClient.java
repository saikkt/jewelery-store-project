package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Collection;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CollectionClient {
    List<Collection> getAllCollections();
}
