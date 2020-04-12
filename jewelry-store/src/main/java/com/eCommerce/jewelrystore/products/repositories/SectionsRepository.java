package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Collection;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SectionsRepository extends JpaRepository<Section,Long> {
    Optional<Section> findBySectionName(String sectionName);
    Optional<Section> findBySectionID(long sectionId);
}
