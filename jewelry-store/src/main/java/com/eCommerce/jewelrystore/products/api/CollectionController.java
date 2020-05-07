package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Collection;
import com.eCommerce.jewelrystore.products.service.CategoryService;
import com.eCommerce.jewelrystore.products.service.CollectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collections")
public class CollectionController {


    @Autowired
    CollectionService collectionService;

    Logger logger = LoggerFactory.getLogger(CollectionController.class);

    @GetMapping("/getAll")
    public ResponseEntity<List<Collection>> getCategories(){
        return  ResponseEntity.ok().body(collectionService.getcollections());
    }

    @GetMapping("/getByCollectionName/{collectionName}")
    public ResponseEntity<Collection> getCollectionByName(@PathVariable String collectionName){
        Collection collection = collectionService.getCollectionByName(collectionName);
        if(collection==null){
            logger.info("Collection requested not found "+collectionName);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(collection);
    }


    @PostMapping("/postCollection")
    public ResponseEntity<Collection> postCollection(@RequestBody Collection collection){
        Collection savedCollection = collectionService.saveCollection(collection);
        if(savedCollection==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedCollection);
    }


    @PostMapping("/postCollections")
    public ResponseEntity<List<Collection>> postCollections(@RequestBody List<Collection> collections){
    	List<Collection> savedCollections = collectionService.saveCollections(collections);
        if(savedCollections==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedCollections);
    }

    @PutMapping("/updateCollection")
    public ResponseEntity<Collection> updateCollection(@RequestBody Collection collection){
        Collection savedCollection = collectionService.updateCollection(collection);
        if(savedCollection==null)
            return ResponseEntity.unprocessableEntity().build();
        return ResponseEntity.ok().body(savedCollection);
    }

    @DeleteMapping("/deleteCollection/{collectionId}")
    public ResponseEntity<HttpStatus> deleteCollection(@PathVariable long collectionId){
        collectionService.deleteCollection(collectionId);
        return ResponseEntity.ok().build();
    }

}
