package com.eCommerce.jewelrystore.landingpage.repository;

import com.eCommerce.jewelrystore.landingpage.domain.CarouselImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarouselImageRepository extends JpaRepository<CarouselImage,Long> {
}
