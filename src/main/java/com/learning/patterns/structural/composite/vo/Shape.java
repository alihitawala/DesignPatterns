package com.learning.patterns.structural.composite.vo;

import com.gs.collections.api.list.MutableList;

/**
 * Created by aliHitawala on 1/10/15.
 */
public interface Shape {
    /**
     * Draw shape on screen
     *
     * Method that must be implemented by Basic as well as
     * complex shapes
     */
    public void renderShapeToScreen();

    /**
     * Making a complex shape explode results in getting a list of the
     * shapes forming this shape
     *
     *  For example if a rectangle explodes it results in 4 line objects
     *
     * Making a simple shape explode results in returning the shape itself
     */
    public MutableList<Shape> explodeShape();
}
