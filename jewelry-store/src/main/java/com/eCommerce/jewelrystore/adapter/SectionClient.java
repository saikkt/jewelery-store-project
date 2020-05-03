package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Section;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SectionClient {
    List<Section> getAllSections();
}
