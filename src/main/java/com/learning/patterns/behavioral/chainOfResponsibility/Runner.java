package com.learning.patterns.behavioral.chainOfResponsibility;

/**
 * Created by aliHitawala on 8/10/15.
 */
public class Runner {
    public static void main(String[] args) {
        int t1 = 3;//PRINT_TOPIC
        int t2 = 4;//PAPER_ORIENTATION_TOPIC
        int t3 = 5;//APPLICATION_TOPIC
        Application application = new Application();
        Dialog dialog = new Dialog(application, 3);
        Button button = new Button(dialog, 4);
        button.handleHelp();
        dialog.handleHelp();
    }
}
