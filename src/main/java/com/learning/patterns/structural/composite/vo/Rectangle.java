package com.learning.patterns.structural.composite.vo;

import com.gs.collections.api.block.procedure.Procedure;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.list.mutable.FastList;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class Rectangle implements Shape {
    MutableList<Shape> rectangleEdges = FastList.<Shape>newListWith(new Line(-1,-1,1,-1), new Line(-1,1,1,1),
            new Line(-1,-1,-1,1), new Line(1,-1,1,1));
    @Override
    public void renderShapeToScreen() {
        rectangleEdges.forEach(new Procedure<Shape>() {
            @Override
            public void value(Shape shape) {
                shape.renderShapeToScreen();
            }
        });
        System.out.println("Rectangle has been rendered.");
    }

    @Override
    public MutableList<Shape> explodeShape() {
        return rectangleEdges;
    }
}
