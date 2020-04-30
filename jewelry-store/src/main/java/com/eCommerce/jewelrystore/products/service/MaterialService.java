package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.products.model.Material;
import com.eCommerce.jewelrystore.products.repositories.MaterialRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {

    private MaterialRepository materialRepository;

    Logger logger = LoggerFactory.getLogger(MaterialService.class);

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> getAll(){
        return materialRepository.findAll();
    }

    public Optional<Material> getByID(long materialID){
       return materialRepository.findById(materialID);
    }

    public Material saveMaterial(Material material){
        return materialRepository.save(material);
    }

    public void deleteMaterialByID(long materialID){
        materialRepository.deleteById(materialID);
    }

    public Material getByMaterialType(String materialType){
        return materialRepository.findByMaterialType(materialType);
    }
}
