package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.service.SectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sections")
public class SectionController {

    @Autowired
    private SectionService sectionService;

    Logger logger = LoggerFactory.getLogger(SectionController.class);

    @GetMapping("/getAll")
    public ResponseEntity<List<Section>> getSections(){
        return  ResponseEntity.ok().body(sectionService.getsections());
    }

    @GetMapping("/getBySectionName/{sectionName}")
    public ResponseEntity<Section> getSectionByName(@PathVariable String sectionName){
        Section section = sectionService.getSectionByName(sectionName);
        if(section==null){
            logger.info("Section requested not found "+sectionName);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(section);
    }


    @PostMapping("/postSection")
    public ResponseEntity<Section> postSection(@RequestBody Section section){
        Section savedSection = sectionService.saveSection(section);
        if(savedSection==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedSection);
    }


    @PostMapping("/postSections")
    public ResponseEntity<List<Section>> postSections(@RequestBody List<Section> sections){
    	List<Section> savedSections = sectionService.saveSections(sections);
        if(savedSections==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedSections);
    }

    @PutMapping("/updateSection")
    public ResponseEntity<Section> updateSection(@RequestBody Section section){
        Section savedSection = sectionService.updateSection(section);
        if(savedSection==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedSection);
    }

    @DeleteMapping("/deleteSection/{SectionId}")
    public ResponseEntity<HttpStatus> deleteSection(@PathVariable long SectionId){
        sectionService.deleteSection(SectionId);
        return ResponseEntity.ok().build();
    }
}
