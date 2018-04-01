package com.ubay.achmadirjikubay_1202154184_modul6;

/**
 * Created by AIUBAY on 31/03/2018.
 */

public class FeedData {
    private static final FeedData ourInstance = new FeedData();

    public String imageName;

    public String imageURL;
    public String userImage;

    public FeedData() {

    }

    public FeedData(String name, String url, String user) {

        this.imageName = name;
        this.imageURL= url;
        this.userImage = user;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }
    public String getUserImage() {
        return userImage;
    }
}
