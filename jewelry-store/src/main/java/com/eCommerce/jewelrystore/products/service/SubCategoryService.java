package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.products.model.SubCategory;
import com.eCommerce.jewelrystore.products.repositories.SubCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {

    private SubCategoryRepository subCategoryRepository;

    public SubCategoryService(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    public List<SubCategory> getByCategoryID(long categoryID){
        return subCategoryRepository.findByCategoryID(categoryID);
    }

    public SubCategory getBySubCategoryName(String subCategoryName){
        return subCategoryRepository.findBySubCategoryName(subCategoryName).get();
    }

    public List<SubCategory> getAll(){
        return subCategoryRepository.findAll();
    }

	public List<SubCategory> saveSubCategories(List<SubCategory> subCategories) {
		return subCategoryRepository.saveAll(subCategories);
	}
}
