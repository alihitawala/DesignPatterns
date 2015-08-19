package com.learning.patterns.behavioral.chainOfResponsibility;

/**
 * Created by aliHitawala on 8/10/15.
 */
public class Button extends Widget{
    public Button(Widget parent, int topic) {
        super(parent, topic);
    }

    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("How to use this BUTTON");
        }
        else {
            super.handleHelp();
        }
    }
}
