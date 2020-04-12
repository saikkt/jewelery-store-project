package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Collection;
import com.eCommerce.jewelrystore.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollectionsRepository extends JpaRepository<Collection,Long> {
    Optional<Collection> findByCollectionName(String collectionName);
    Optional<Collection> findByCollectionID(long collectionID);
}
