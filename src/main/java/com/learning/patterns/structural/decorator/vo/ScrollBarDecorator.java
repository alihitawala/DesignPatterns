package com.learning.patterns.structural.decorator.vo;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class ScrollBarDecorator extends Decorator {

    public ScrollBarDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("ScrollBar Decorator at work...");
    }
}
