package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.products.model.Category;
import com.eCommerce.jewelrystore.products.model.Collection;
import com.eCommerce.jewelrystore.products.model.Product;
import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.repositories.CategoryRepository;
import com.eCommerce.jewelrystore.products.repositories.CollectionsRepository;
import com.eCommerce.jewelrystore.products.repositories.ProductsRepository;
import com.eCommerce.jewelrystore.products.repositories.SectionsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductsRepository productsRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    SectionsRepository sectionsRepository;
    @Autowired
    CollectionsRepository collectionsRepository;

    Logger logger = LoggerFactory.getLogger(ProductService.class);

    public Product getByProductID(long productID){
        return productsRepository.findByProductID(productID);
    }

    public List<Product> getProducts(){
        List<Product> products = null;
        try {
            products = productsRepository.findAll();
        }
        catch (Exception e){
           logger.error("Exception reading data from Products table "+e);
        }
        return products;
    }

    public List<Product> getProductByCategory(String categoryName){
        List<Product> product=null;
        try {
            Optional<Category> category = Optional.of(categoryRepository.findByCategoryName(categoryName));
            if(!category.isPresent())
            {
                logger.info("Category does not exists "+categoryName);
                return null;
            }
            product = productsRepository.findByCategoryID(category.get().getCategoryID());
        }
        catch(Exception e){
            logger.error("Exception reading data from Products table by Category "+e);
        }
        return product;
    }

    public List<Product> getProductByCollection(String collectionName){
        List<Product> product=null;
        try {
            Optional<Collection> collection = collectionsRepository.findByCollectionName(collectionName);
            if(!collection.isPresent())
            {
                logger.info("Collection does not exists "+collectionName);
                return null;
            }
            product = productsRepository.findByCollectionID(collection.get().getCollectionID());
        }
        catch(Exception e){
            logger.error("Exception reading data from Products table by Collection "+e);
        }
        return product;
    }

    public List<Product> getProductBySection(String sectionName){
        List<Product> product=null;
        try {
            Optional<Section> section = sectionsRepository.findBySectionName(sectionName);
            if(!section.isPresent())
            {
                logger.info("Section does not exists "+sectionName);
                return null;
            }
            product = productsRepository.findBySectionID(section.get().getSectionID());
        }
        catch(Exception e){
            logger.error("Exception reading data from Products table by Section "+e);
        }
        return product;
    }

    public Product saveProduct(Product product){
        Product savedProduct = null;
        try{
        savedProduct = productsRepository.save(product);
        }
        catch(Exception e){
            logger.error("Could not save the product with name "+product.getProductName()+"  "+e);
        }
        return savedProduct;
    }

    public List<Product> saveProducts(List<Product> products){
        List<Product> savedProducts = productsRepository.saveAll(products);
        return savedProducts;
    }

    public void deleteProduct(long productId){
        Product product=productsRepository.findByProductID(productId);
        productsRepository.delete(product);
    }
}
