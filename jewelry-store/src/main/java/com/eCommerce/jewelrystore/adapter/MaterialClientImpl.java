package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Material;
import com.eCommerce.jewelrystore.products.service.MaterialService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MaterialClientImpl implements MaterialClient {

    private MaterialService materialService;

    public MaterialClientImpl(MaterialService materialService) {
        this.materialService = materialService;
    }

    @Override
    public List<Material> getAllMaterials() {
        return materialService.getAll();
    }
}
