package com.eCommerce.jewelrystore.landingpage.repository;

import com.eCommerce.jewelrystore.landingpage.domain.Combo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboRepository extends JpaRepository<Combo,Long> {
}
