package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByCategoryName(String categoryName);
    Category findByCategoryID(long categoryID);
}
