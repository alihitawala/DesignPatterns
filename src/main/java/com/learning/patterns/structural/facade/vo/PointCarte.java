package com.learning.patterns.structural.facade.vo;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class PointCarte {
    private Double x,y;

    public PointCarte(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public void move(Double dx, Double dy)
    {
        this.x += dx;
        this.y += dy;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "PointCarte{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
