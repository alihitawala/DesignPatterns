package com.learning.patterns.behavioral.chainOfResponsibility;

/**
 * Created by aliHitawala on 8/10/15.
 */
public abstract class HelpHandler {
    private HelpHandler successor;
    private int topic;
    private static final int NO_HELP = -1;

    public HelpHandler() {
    }

    public HelpHandler(HelpHandler successor, int topic) {
        this.successor = successor;
        this.topic = topic;
    }

    public void setSuccessor(HelpHandler successor, int topic) {
        this.successor = successor;
        this.topic = topic;
    }

    public boolean hasHelp() {
        return this.topic != NO_HELP;
    }

    public void handleHelp() {
        if (successor != null)
            successor.handleHelp();
    }
}
