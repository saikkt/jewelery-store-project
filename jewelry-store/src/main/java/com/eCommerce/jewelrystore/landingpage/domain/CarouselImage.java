package com.eCommerce.jewelrystore.landingpage.domain;

import javax.persistence.*;

@Entity
@Table(name = "jCarouselImages")
public class CarouselImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ImageID")
    private long imageID;

    @Column(name = "ImageURL")
    private String imageURL;

    @Column(name = "ImageDescription")
    private String imageDescription;

    @Column(name = "SecondSentence")
    private String secondSentence;

    @Column(name = "ImageOrientation")
    private String imageOrientation;

    protected CarouselImage(){}

    public long getImageID() {
        return imageID;
    }

    public void setImageID(long imageID) {
        this.imageID = imageID;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public String getSecondSentence() {
        return secondSentence;
    }

    public void setSecondSentence(String secondSentence) {
        this.secondSentence = secondSentence;
    }

    public String getImageOrientation() {
        return imageOrientation;
    }

    public void setImageOrientation(String imageOrientation) {
        this.imageOrientation = imageOrientation;
    }
}
