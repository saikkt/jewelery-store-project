package com.eCommerce.jewelrystore.guest.repository;

import com.eCommerce.jewelrystore.guest.domain.GuestOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestOrderItemRepository extends JpaRepository<GuestOrderItem, Long> {

}
