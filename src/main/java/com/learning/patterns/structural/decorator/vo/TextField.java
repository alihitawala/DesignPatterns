package com.learning.patterns.structural.decorator.vo;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class TextField implements Widget {
    private int height;
    private int width;

    public TextField(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "TextField{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
