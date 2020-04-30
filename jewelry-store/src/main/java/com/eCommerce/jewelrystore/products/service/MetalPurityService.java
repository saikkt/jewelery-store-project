package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.products.model.MetalPurity;
import com.eCommerce.jewelrystore.products.repositories.MetalPurityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetalPurityService {

    private MetalPurityRepository metalPurityRepository;

    public MetalPurityService(MetalPurityRepository metalPurityRepository) {
        this.metalPurityRepository = metalPurityRepository;
    }

    public List<MetalPurity> getAll(){
        return metalPurityRepository.findAll();
    }

    public Optional<MetalPurity> findByID(long metalPurityID){
        return metalPurityRepository.findById(metalPurityID);
    }

    public MetalPurity save(MetalPurity metalPurity){
        return metalPurityRepository.save(metalPurity);
    }

    public void deleteByID(long metalPurityID){
        metalPurityRepository.deleteById(metalPurityID);
    }

    public MetalPurity findByPurity(String purity){
        return metalPurityRepository.findByPurity(purity);
    }
}
