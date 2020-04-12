package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.products.model.Collection;
import com.eCommerce.jewelrystore.products.repositories.CollectionsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollectionService {

    @Autowired
    CollectionsRepository collectionsRepository;

    Logger logger = LoggerFactory.getLogger(CollectionService.class);

    public List<Collection> getcollections(){
        List<Collection> collections = null;
        try {
            collections = collectionsRepository.findAll();
        }
        catch (Exception e){
            logger.error("Exception reading data from collections table "+e);
        }
        return collections;
    }

    public Collection getCollectionByName(String collectionName){
        Optional<Collection> collection=null;
        try {
             collection= collectionsRepository.findByCollectionName(collectionName);
             if(!collection.isPresent())
             {
                 logger.info("No Collection exists with given Name "+collectionName);
                 return null;
             }
        }
        catch(Exception e){
            logger.error("Exception reading data from Products table by Collection "+e);
        }
        return collection.get();
    }


    public Collection saveCollection(Collection collection){
        Collection savedCollection = null;
        try{
            savedCollection = collectionsRepository.save(collection);
        }
        catch(Exception e){
            logger.error("Could not save the Collection with name "+collection.getCollectionName()+"  "+e);
        }
        return savedCollection;
    }

    public void deleteCollection(long CollectionId){
        Optional<Collection> collection=collectionsRepository.findByCollectionID(CollectionId);
        if(!collection.isPresent()){
                logger.info("No Collection exists with given Id "+CollectionId);
                return ;
        }
        collectionsRepository.delete(collection.get());
    }

    public Collection updateCollection(Collection collection) {
        Collection savedCollection = null;
        Optional<Collection> existingCollection = collectionsRepository.findByCollectionID(collection.getCollectionID());
        if(!existingCollection.isPresent())
        {
            logger.info("Update failed because there is no Collection exists with the given ID "+collection.getCollectionID());
            return savedCollection;
        }
        try {
            savedCollection = collectionsRepository.save(collection);
        }
        catch (Exception e){
            logger.info("Exception occured while updating the Collection with ID "+collection.getCollectionID());
            return null;
        }
        return savedCollection;
    }
}
