package com.learning.patterns.structural.decorator;

import com.learning.patterns.structural.decorator.vo.BorderDecorator;
import com.learning.patterns.structural.decorator.vo.ScrollBarDecorator;
import com.learning.patterns.structural.decorator.vo.TextField;
import com.learning.patterns.structural.decorator.vo.Widget;

/**
 * Created by aliHitawala on 1/11/15.
 */
public class DecoratorRunner {
    public static void main(String[] args) {
        Widget aWidget = new BorderDecorator(
                new BorderDecorator(
                        new ScrollBarDecorator(
                                new TextField(80, 24))));
        aWidget.draw();
    }
}