package com.eCommerce.jewelrystore.landingpage.service;

import com.eCommerce.jewelrystore.landingpage.domain.CarouselImage;
import com.eCommerce.jewelrystore.landingpage.repository.CarouselImageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselImageService {

    private CarouselImageRepository carouselImageRepository;

    public CarouselImageService(CarouselImageRepository carouselImageRepository) {
        this.carouselImageRepository = carouselImageRepository;
    }

    public List<CarouselImage> getAllCarouselImages(){
        return carouselImageRepository.findAll();
    }
}
