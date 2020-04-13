package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Integer> {

    Product findByProductID(long productID);
    List<Product> findByCategoryID(long categoryID);
    List<Product> findByCollectionID(long collectionID);
    List<Product> findBySectionID(long sectionID);

}
