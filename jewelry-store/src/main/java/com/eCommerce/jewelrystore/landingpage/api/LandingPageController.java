package com.eCommerce.jewelrystore.landingpage.api;

import com.eCommerce.jewelrystore.landingpage.domain.LandingPage;
import com.eCommerce.jewelrystore.landingpage.service.LandingPageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/navbar")
public class LandingPageController {

    private LandingPageService landingPageService;

    public LandingPageController(LandingPageService landingPageService) {
        this.landingPageService = landingPageService;
    }

    @GetMapping
    public ResponseEntity<LandingPage> getNavBar(){
       return ResponseEntity.ok(landingPageService.getHomePageNavBar());
    }
}
