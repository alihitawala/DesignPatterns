package com.learning.patterns.behavioral.chainOfResponsibility;

/**
 * Created by aliHitawala on 8/10/15.
 */
public class Widget extends HelpHandler{
    private Widget _parent;

    public Widget(){}

    public Widget(Widget parent, int topic) {
        super(parent, topic);
        _parent = parent;
    }
}
