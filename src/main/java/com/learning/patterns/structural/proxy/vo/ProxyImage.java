package com.learning.patterns.structural.proxy.vo;

/**
 * Created by Rahul Dubey on 2/27/2015.
 */
public class ProxyImage implements Image {
    private String fileName = null;
    private Image image = null;
    public  ProxyImage(String fileName){
        this.fileName = fileName;
    }
    public void showImage() {
        if(image == null){ // Lazy Loading
            image = new RealImage(fileName);
        }
        image.showImage();
    }
}
