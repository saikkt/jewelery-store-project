package com.eCommerce.jewelrystore.images.homepageslidingimages.repository;

import com.eCommerce.jewelrystore.images.homepageslidingimages.domain.HomePageSlidingImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomePageSlidingImagesRepository extends JpaRepository<HomePageSlidingImage,Long> {
}
