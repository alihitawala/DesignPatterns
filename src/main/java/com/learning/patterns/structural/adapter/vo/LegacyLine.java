package com.learning.patterns.structural.adapter.vo;

/**
 * Created by aliHitawala on 1/6/15.
 */
public class LegacyLine {
    public void draw(int x1, int x2, int y1, int y2)
    {
        System.out.println("line from (" + x1 + "," + y1 + ") to (" + x2 + ","
                + y2 + ")");
    }
}
