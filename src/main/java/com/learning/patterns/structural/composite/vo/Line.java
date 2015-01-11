package com.learning.patterns.structural.composite.vo;

import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.list.mutable.FastList;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class Line implements Shape {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Line(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    public void renderShapeToScreen() {
        System.out.println(this);
    }

    @Override
    public MutableList<Shape> explodeShape() {
        return FastList.<Shape>newListWith(this);
    }

    @Override
    public String toString() {
        return "Line{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                '}';
    }
}
