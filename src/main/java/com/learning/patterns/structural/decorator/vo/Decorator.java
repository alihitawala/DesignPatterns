package com.learning.patterns.structural.decorator.vo;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class Decorator implements Widget {
    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public void draw() {
        this.widget.draw();
    }
}
