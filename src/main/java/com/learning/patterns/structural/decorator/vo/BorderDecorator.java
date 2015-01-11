package com.learning.patterns.structural.decorator.vo;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class BorderDecorator extends Decorator {

    public BorderDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Border Decorator at work...");
    }

}
