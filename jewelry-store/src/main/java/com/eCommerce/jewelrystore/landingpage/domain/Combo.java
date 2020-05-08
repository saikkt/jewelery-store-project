package com.eCommerce.jewelrystore.landingpage.domain;

import javax.persistence.*;

@Entity
@Table(name = "jCombos")
public class Combo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ComboID")
    private long comboID;

    @Column(name = "ComboImagePath")
    private String comboImagePath;

    @Column(name = "ComboName")
    private String comboName;

    protected Combo(){ }

    public long getComboID() {
        return comboID;
    }

    public void setComboID(long comboID) {
        this.comboID = comboID;
    }

    public String getComboImagePath() {
        return comboImagePath;
    }

    public void setComboImagePath(String comboImagePath) {
        this.comboImagePath = comboImagePath;
    }

    public String getComboName() {
        return comboName;
    }

    public void setComboName(String comboName) {
        this.comboName = comboName;
    }
}
