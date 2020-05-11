package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Material;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MaterialClient {
    List<Material> getAllMaterials();
}
