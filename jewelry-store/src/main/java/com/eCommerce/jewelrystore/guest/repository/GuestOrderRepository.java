package com.eCommerce.jewelrystore.guest.repository;

import com.eCommerce.jewelrystore.guest.domain.GuestOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestOrderRepository extends JpaRepository<GuestOrder,Long> {
}
