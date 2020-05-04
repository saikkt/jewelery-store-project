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

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    Logger logger = LoggerFactory.getLogger(CategoryService.class);

    public List<Category> getCategories(){
        List<Category> categories = null;
        try {
            categories = categoryRepository.findAll();
        }
        catch (Exception e){
            logger.error("Exception reading data from Categories table "+e);
        }
        return categories;
    }

    public Category getCategoryByName(String categoryName){
        Category category=null;
        try {
            category = categoryRepository.findByCategoryName(categoryName);
        }
        catch(Exception e){
            logger.error("Exception reading data from Products table by Category "+e);
        }
        return category;
    }


    public Category saveCategory(Category category){
        Category savedCategory = null;
        try{
            savedCategory = categoryRepository.save(category);
        }
        catch(Exception e){
            logger.error("Could not save the category with name "+category.getCategoryName()+"  "+e);
        }
        return savedCategory;
    }

    public void deleteCategory(long categoryId){
        Category category=categoryRepository.findByCategoryID(categoryId);
        categoryRepository.delete(category);
    }

    public Category updateCategory(Category category) {
        Category savedCategory = null;
        Category existingCategory = categoryRepository.findByCategoryID(category.getCategoryID());
        if(existingCategory==null)
        {
            logger.info("Update failed because there is no category exists with the given ID "+category.getCategoryID());
            return savedCategory;
        }
        try {
            savedCategory = categoryRepository.save(category);
        }
        catch (Exception e){
            logger.info("Exception occured while updating the Category with ID "+category.getCategoryID());
            return null;
        }
        return savedCategory;
    }

	public List<Category> saveCategories(List<Category> categories) {
		List<Category> savedCategories = categoryRepository.saveAll(categories);
		return savedCategories;
	}
}
