package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory,Long> {
    List<SubCategory> findByCategoryID(long categoryID);
}
