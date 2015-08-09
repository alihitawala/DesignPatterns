package com.learning.patterns.structural.proxy;

import com.learning.patterns.structural.proxy.vo.Image;
import com.learning.patterns.structural.proxy.vo.ProxyImage;

/**
 * Created by Rahul Dubey on 2/27/2015.
 */
public class ProxyRunner {
    public static void main(String[] args) {
        Image imageOne = new ProxyImage("picture One");
        imageOne.showImage();
        imageOne.showImage();
        Image imageTwo = new ProxyImage("picture Two");
        imageTwo.showImage();

    }

}
