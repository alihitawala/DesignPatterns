package com.learning.patterns.structural.facade.vo;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class PointPolar {
    private Double radius, angle;

    public PointPolar(Double radius, Double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    public void rotate(Double angle)
    {
        this.angle += angle % 360;
    }

    @Override
    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}
