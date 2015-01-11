package com.learning.patterns.structural.adapter.vo;

/**
 * Created by aliHitawala on 1/6/15.
 */
public class LegacyRectangle {
    public void draw (int x, int y, int width, int height)
    {
        System.out.println("Rectangle at (" + x + "," + y + ") with width " + width
                + " and height " + height);
    }
}
