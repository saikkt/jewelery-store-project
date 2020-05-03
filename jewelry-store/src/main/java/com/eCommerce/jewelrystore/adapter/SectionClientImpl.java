package com.eCommerce.jewelrystore.adapter;

import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.service.SectionService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SectionClientImpl implements SectionClient {

    private SectionService sectionService;

    public SectionClientImpl(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    @Override
    public List<Section> getAllSections() {
       return sectionService.getsections();
    }
}
