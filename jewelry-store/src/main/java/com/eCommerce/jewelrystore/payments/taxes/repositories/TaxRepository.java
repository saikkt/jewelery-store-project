package com.eCommerce.jewelrystore.payments.taxes.repositories;

import com.eCommerce.jewelrystore.payments.taxes.domain.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaxRepository extends JpaRepository<Tax,Long> {

    Optional<Tax> findByTaxType(String federal);
}
