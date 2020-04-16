package com.eCommerce.jewelrystore.shipping.repositories;

import com.eCommerce.jewelrystore.shipping.domain.ShippingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingDetailsRepository extends JpaRepository<ShippingDetails,Long> {
}
