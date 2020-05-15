package com.eCommerce.jewelrystore.landingpage.homepageslidingimages.service;

import com.eCommerce.jewelrystore.landingpage.homepageslidingimages.domain.HomePageSlidingImage;
import com.eCommerce.jewelrystore.landingpage.homepageslidingimages.repository.HomePageSlidingImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HomePageSlidingService {

    @Autowired
    private HomePageSlidingImagesRepository homePageSlidingImagesRepository;

    public List<HomePageSlidingImage> getAllHomePageImages(){
        return homePageSlidingImagesRepository.findAll();
    }

    public HomePageSlidingImage saveHomePageImage(HomePageSlidingImage homePageSlidingImage){
        HomePageSlidingImage savedHomePageSlidingImage = homePageSlidingImagesRepository.save(homePageSlidingImage);
        if(savedHomePageSlidingImage==null){
            return null;
        }
        return savedHomePageSlidingImage;
    }

    public void deleteHomePage(long homePageImageId){
        Optional<HomePageSlidingImage> existingImage = homePageSlidingImagesRepository.findById(homePageImageId);
        if(!existingImage.isPresent())
            return;

        homePageSlidingImagesRepository.delete(existingImage.get());
    }


}
