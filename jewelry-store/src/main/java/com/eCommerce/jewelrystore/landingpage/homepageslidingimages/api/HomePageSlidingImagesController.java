package com.eCommerce.jewelrystore.landingpage.homepageslidingimages.api;

import com.eCommerce.jewelrystore.landingpage.homepageslidingimages.domain.HomePageSlidingImage;
import com.eCommerce.jewelrystore.landingpage.homepageslidingimages.service.HomePageSlidingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homePageSlidingImages")
public class HomePageSlidingImagesController {

    @Autowired
    private HomePageSlidingService homePageSlidingService;

    @GetMapping("/getAllImages")
    public ResponseEntity<List<HomePageSlidingImage>> getAll(){
        return ResponseEntity.ok().body(homePageSlidingService.getAllHomePageImages());
    }

    @PostMapping("/postHomePageImage")
    public ResponseEntity<HomePageSlidingImage> postImage(@RequestBody HomePageSlidingImage homePageSlidingImage){
        return ResponseEntity.ok().body(homePageSlidingService.saveHomePageImage(homePageSlidingImage));
    }

    @PutMapping("/updateHomePageImage")
    public ResponseEntity<HomePageSlidingImage> updateImage(@RequestBody HomePageSlidingImage homePageSlidingImage){
        return ResponseEntity.ok().body(homePageSlidingService.saveHomePageImage(homePageSlidingImage));
    }

    @DeleteMapping("/deleteHomePageImage/{homePageSlidingImageId}")
    public ResponseEntity<HttpStatus> deleteImage(@PathVariable long homePageSlidingImageId){
        homePageSlidingService.deleteHomePage(homePageSlidingImageId);
        return ResponseEntity.ok().build();
    }
}
