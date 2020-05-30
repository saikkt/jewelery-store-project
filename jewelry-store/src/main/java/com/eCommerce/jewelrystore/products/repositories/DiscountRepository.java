package com.eCommerce.jewelrystore.products.repositories;

import com.eCommerce.jewelrystore.products.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Long> {
    @Query(value = "select * from jDiscount d where d.Percentage<>0",nativeQuery = true)
    List<Discount> findAllDiscountsWithPercentages();
    Discount findByDiscountType(String discountType);
}
