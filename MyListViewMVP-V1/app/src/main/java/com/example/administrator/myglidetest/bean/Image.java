package com.example.administrator.myglidetest.bean;

public class Image {

    private String imageurl;
    private String text;

    public Image(String imageurl, String text) {
        this.imageurl = imageurl;
        this.text = text;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
