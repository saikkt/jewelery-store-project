package com.eCommerce.jewelrystore.products.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;

@JsonSerialize
@Entity
@Table(name = "jSections")
public class Section {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SectionID")
    private long sectionID;

    @Column(name = "SectionName")
    private String sectionName;

    public Section() {
    }

    public long getSectionID() {
        return sectionID;
    }

    public void setSectionID(long sectionID) {
        this.sectionID = sectionID;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }


}

