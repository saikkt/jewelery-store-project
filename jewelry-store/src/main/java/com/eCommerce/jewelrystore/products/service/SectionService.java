package com.eCommerce.jewelrystore.products.service;

import com.eCommerce.jewelrystore.products.model.Section;
import com.eCommerce.jewelrystore.products.repositories.SectionsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectionService {

    @Autowired
    SectionsRepository sectionsRepository;

    Logger logger = LoggerFactory.getLogger(SectionService.class);

    public List<Section> getsections(){
        List<Section> sections = null;
        try {
            sections = sectionsRepository.findAll();
        }
        catch (Exception e){
            logger.error("Exception reading data from sections table "+e);
        }
        return sections;
    }

    public Section getSectionByName(String sectionName){
        Optional<Section> Section=null;
        try {
            Section= sectionsRepository.findBySectionName(sectionName);
            if(!Section.isPresent())
            {
                logger.info("No Section exists with given Name "+sectionName);
                return null;
            }
        }
        catch(Exception e){
            logger.error("Exception reading data from Sections table by Section-Name "+sectionName+" "+e);
        }
        return Section.get();
    }


    public Section saveSection(Section Section){
        Section savedSection = null;
        try{
            savedSection = sectionsRepository.save(Section);
        }
        catch(Exception e){
            logger.error("Could not save the Section with name "+Section.getSectionName()+"  "+e);
        }
        return savedSection;
    }

    public void deleteSection(long SectionId){
        Optional<Section> Section=sectionsRepository.findBySectionID(SectionId);
        if(!Section.isPresent()){
            logger.info("No Section exists with given Id "+SectionId);
            return ;
        }
        sectionsRepository.delete(Section.get());
    }

    public Section updateSection(Section Section) {
        Section savedSection = null;
        Optional<Section> existingSection = sectionsRepository.findBySectionID(Section.getSectionID());
        if(!existingSection.isPresent())
        {
            logger.info("Update failed because there is no Section exists with the given ID "+Section.getSectionID());
            return savedSection;
        }
        try {
            savedSection = sectionsRepository.save(Section);
        }
        catch (Exception e){
            logger.info("Exception occured while updating the Section with ID "+Section.getSectionID());
            return null;
        }
        return savedSection;
    }


}
