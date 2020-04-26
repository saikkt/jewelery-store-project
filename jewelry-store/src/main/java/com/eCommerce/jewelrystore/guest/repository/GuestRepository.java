package com.eCommerce.jewelrystore.guest.repository;

import com.eCommerce.jewelrystore.guest.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest,Long> {
}
