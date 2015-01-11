package com.learning.patterns.structural.adapter.vo;

/**
 * Created by aliHitawala on 1/7/15.
 */
public class Rectangle implements Shape {

    private LegacyRectangle legacyRectangle = new LegacyRectangle();

    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        legacyRectangle.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1),
                Math.abs(y2 - y1));
    }
}
