package com.learning.patterns.structural.composite.vo;

import com.gs.collections.api.block.procedure.Procedure;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.list.mutable.FastList;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class ComplexShape implements Shape {
    MutableList<Shape> shapeList = FastList.newList();

    public void addToShape (Shape shape)
    {
        shapeList.add(shape);
    }

    @Override
    public void renderShapeToScreen() {
        shapeList.forEach(new Procedure<Shape>() {
            @Override
            public void value(Shape shape) {
                shape.renderShapeToScreen();
            }
        });
        System.out.println("Complex object has been rendered has been rendered.");
    }

    @Override
    public MutableList<Shape> explodeShape() {
        return shapeList;
    }
}
