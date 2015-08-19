package com.learning.patterns.behavioral.chainOfResponsibility;

/**
 * Created by aliHitawala on 8/10/15.
 */
public class Dialog extends Widget {
    public Dialog(HelpHandler helpHandler, int topic) {
        setSuccessor(helpHandler, topic);
    }

    @Override
    public void handleHelp() {
        if (hasHelp())
            System.out.println("Help section for the dialog BOX");
        else
            super.handleHelp();
    }
}
