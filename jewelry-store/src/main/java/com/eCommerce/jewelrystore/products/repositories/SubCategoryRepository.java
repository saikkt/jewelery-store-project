package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory,Long> {
    Optional<SubCategory> findBySubCategoryName(String subCategoryName);
    List<SubCategory> findByCategoryID(long categoryID);
}
