package com.eCommerce.jewelrystore.landingpage.homepageslidingimages.domain;

import com.eCommerce.jewelrystore.landingpage.homepageslidingimages.utility.ImageOrientation;

import javax.persistence.*;

@Entity
@Table(name="jHomePageSlidingImages")
public class HomePageSlidingImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ImageID")
    private long imageID;

    @Column(name = "ImageUrl")
    private String imageUrl;

    @Column(name = "ImageDescription")
    private String ImageDescription;

    @Enumerated(EnumType.STRING)
    @Column(name = "ImageOrientation")
    private ImageOrientation imageOrientation;

    public HomePageSlidingImage() {
    }

    public long getImageID() {
        return imageID;
    }

    public void setImageID(long imageID) {
        this.imageID = imageID;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageDescription() {
        return ImageDescription;
    }

    public void setImageDescription(String imageDescription) {
        ImageDescription = imageDescription;
    }

    public ImageOrientation getImageOrientation() {
        return imageOrientation;
    }

    public void setImageOrientation(ImageOrientation imageOrientation) {
        this.imageOrientation = imageOrientation;
    }
}
