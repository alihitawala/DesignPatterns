package com.learning.patterns.structural.composite;

import com.gs.collections.api.block.procedure.Procedure;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.list.mutable.FastList;
import com.learning.patterns.structural.composite.vo.ComplexShape;
import com.learning.patterns.structural.composite.vo.Line;
import com.learning.patterns.structural.composite.vo.Rectangle;
import com.learning.patterns.structural.composite.vo.Shape;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class GraphicsEditorCompositeRunner {
    public static void main(String[] args) {

        MutableList<Shape> allShapesInSoftware = FastList.newList();

        // create a line shape
        Shape lineShape = new Line(0, 0, 1, 1);

        // add it to the shapes
        allShapesInSoftware.add(lineShape);

        // create a rectangle shape
        Shape rectangleShape = new Rectangle();

        // add it to shapes

        allShapesInSoftware.add(rectangleShape);

        // create a complex shape
        // note that we have dealt with the complex shape
        // not with shape interface because we want
        // to do a specific operation
        // that does not apply to all shapes
        ComplexShape complexShape = new ComplexShape();

        // complex shape is made of the rectangle and the line

        complexShape.addToShape(rectangleShape);

        complexShape.addToShape(lineShape);

        // add to shapes

        allShapesInSoftware.add(complexShape);
        // create a more complex shape which is made of the
        // previously created complex shape
        // as well as a line

        ComplexShape veryComplexShape = new ComplexShape();

        veryComplexShape.addToShape(complexShape);

        veryComplexShape.addToShape(lineShape);


        allShapesInSoftware.add(veryComplexShape);

        renderGraphics(allShapesInSoftware);


        // you can explode any object
        // despite the fact that the shape might be
        // simple or complex

        MutableList<Shape> shapes = allShapesInSoftware.get(0).explodeShape();
    }

    private static void renderGraphics(MutableList<Shape> shapesToRender) {

        // note that despite the fact there are
        // simple and complex shapes
        // this method deals with them uniformly
        // and using the Shape interface

        shapesToRender.forEach(new Procedure<Shape>() {
            @Override
            public void value(Shape shape) {
                System.out.println("\n\nRendering a new object...");
                shape.renderShapeToScreen();
            }
        });
    }
}