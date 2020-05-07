package com.eCommerce.jewelrystore.landingpage.service;

import com.eCommerce.jewelrystore.landingpage.domain.Combo;
import com.eCommerce.jewelrystore.landingpage.repository.ComboRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComboService {

    private ComboRepository comboRepository;

    public ComboService(ComboRepository comboRepository) {
        this.comboRepository = comboRepository;
    }

    public List<Combo> getAllCombos(){
        return comboRepository.findAll();
    }
}
