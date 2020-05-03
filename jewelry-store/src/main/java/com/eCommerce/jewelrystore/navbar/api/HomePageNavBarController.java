package com.eCommerce.jewelrystore.navbar.api;

import com.eCommerce.jewelrystore.navbar.domain.HomePageNavBar;
import com.eCommerce.jewelrystore.navbar.service.HomePageNavBarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/navbar")
public class HomePageNavBarController {

    private HomePageNavBarService homePageNavBarService;

    public HomePageNavBarController(HomePageNavBarService homePageNavBarService) {
        this.homePageNavBarService = homePageNavBarService;
    }

    @GetMapping
    public ResponseEntity<HomePageNavBar> getNavBar(){
       return ResponseEntity.ok(homePageNavBarService.getHomePageNavBar());
    }
}
