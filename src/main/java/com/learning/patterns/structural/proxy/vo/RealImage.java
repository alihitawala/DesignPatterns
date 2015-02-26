package com.learning.patterns.structural.proxy.vo;

/**
 * Created by Rahul Dubey on 2/27/2015.
 */
public class RealImage implements Image {
    private String fileName = null;
    public RealImage(String fileName){
        this.fileName = fileName;
        LoadImageFromDisk();

    }

    private void LoadImageFromDisk() {
        System.out.println("Loading Image From Disk : " + fileName);
    }

    public void showImage() {
        System.out.println("Displaying Image for  : " + fileName);

    }
}
