package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Collection;
import com.eCommerce.jewelrystore.products.service.CollectionService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CollectionClientImpl implements CollectionClient {

    private CollectionService collectionService;

    public CollectionClientImpl(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @Override
    public List<Collection> getAllCollections() {
        return collectionService.getcollections();
    }
}
