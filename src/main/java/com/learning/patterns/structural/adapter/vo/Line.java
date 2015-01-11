package com.learning.patterns.structural.adapter.vo;

/**
 * Created by aliHitawala on 1/6/15.
 */
public class Line implements Shape {

    private LegacyLine legacyLine = new LegacyLine();

    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        this.legacyLine.draw(x1, x2, y1, y2);
    }
}
