package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.MetalPurity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetalPurityRepository extends JpaRepository<MetalPurity,Long> {
}
