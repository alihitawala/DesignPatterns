package com.learning.patterns.structural.adapter;

import com.gs.collections.api.block.procedure.Procedure;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.list.mutable.FastList;
import com.learning.patterns.structural.adapter.vo.Line;
import com.learning.patterns.structural.adapter.vo.Rectangle;
import com.learning.patterns.structural.adapter.vo.Shape;

/**
 * Created by aliHitawala on 1/7/15.
 */
public class AdapterRunner {
    public static void main(String[] args) {
        MutableList<Shape> shapes = FastList.newListWith(new Line(), new Rectangle());
        // A begin and end point from a graphical editor
        final int x1 = 10, y1 = 20;
        final int x2 = 30, y2 = 60;
        shapes.forEach(new Procedure<Shape>() {
            @Override
            public void value(Shape shape) {
                shape.draw(x1, y1, x2, y2);
            }
        });
    }
}
