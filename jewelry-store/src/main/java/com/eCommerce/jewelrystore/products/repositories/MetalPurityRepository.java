package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.global.globalmodel.MaterialPurityType;
import com.eCommerce.jewelrystore.products.model.Material;
import com.eCommerce.jewelrystore.products.model.MetalPurity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetalPurityRepository extends JpaRepository<MetalPurity,Long> {
    MetalPurity findByPurity(String purity);
}
