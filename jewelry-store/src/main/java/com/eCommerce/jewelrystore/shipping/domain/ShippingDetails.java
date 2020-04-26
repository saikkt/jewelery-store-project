package com.eCommerce.jewelrystore.shipping.domain;

import javax.persistence.*;

@Entity
@Table(name = "jShippingDetails")
public class ShippingDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="PackingSlipID")
    private long packingSlipId;

    @Column(name="TrackId")
    private String trackId;

    @Column(name="OrderId")
    private long orderId;

    @Column(name="ShipName")
    private String shipName;

    @Column(name="ShipAddress")
    private String shipAddress;

    @Column(name="ShipCity")
    private String ShipCity;

    @Column(name="ShipRegion")
    private String ShipRegion;

    @Column(name="ShipPostalCode")
    private String ShipPostalCode;

    @Column(name="ShipCountry")
    private String ShipCountry;

    @Version
    public int version;



    public ShippingDetails(){
    }

    public ShippingDetails(long orderId){
        this.orderId=orderId;
    }


    public long getPackingSlipId() {
        return packingSlipId;
    }


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return ShipCity;
    }

    public void setShipCity(String shipCity) {
        ShipCity = shipCity;
    }

    public String getShipRegion() {
        return ShipRegion;
    }

    public void setShipRegion(String shipRegion) {
        ShipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return ShipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        ShipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return ShipCountry;
    }

    public void setShipCountry(String shipCountry) {

        if (shipCountry == null ) {
            throw new IllegalArgumentException("shipCountry is required.");
        }
        String cleanName = shipCountry.trim();
        if (cleanName.length() == 0 || cleanName.length() > 50) {
            throw new IllegalArgumentException("shipCountry must be between 1 and 50 characters.");
        }
        this.ShipCountry = cleanName;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setPackingSlipId(long packingSlipId) {
        this.packingSlipId = packingSlipId;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }
}

