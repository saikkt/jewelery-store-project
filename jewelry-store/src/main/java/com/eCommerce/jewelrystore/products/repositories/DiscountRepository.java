package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {

    Discount findByDiscountType(String discountType);
}
