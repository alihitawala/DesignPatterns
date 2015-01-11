package com.learning.patterns.structural.facade.vo;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class Line {
    private Point origin, end;

    public Line(Point origin, Point end) {
        this.origin = origin;
        this.end = end;
    }

    public void move(Double dx, Double dy)
    {
        this.origin.move(dx, dy);
        this.end.move(dx, dy);
    }

    public void rotate(Double angle)
    {
        this.end.rotate(angle, this.origin);
    }

    @Override
    public String toString() {
        return "Line{" +
                "origin=" + origin +
                ", end=" + end +
                '}';
    }
}
