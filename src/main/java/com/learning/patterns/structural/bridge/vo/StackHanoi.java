package com.learning.patterns.structural.bridge.vo;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class StackHanoi extends Stack {
    private int totalRejected = 0;

    public StackHanoi() {
        super("array");
    }

    public StackHanoi(String id) {
        super(id);
    }

    public int reportRejected()   { return totalRejected; }

    public void push(int in) {
        if (!isEmpty()  &&  in>top()) {
            totalRejected++;
        }
        else {
            super.push(in);
        }
    }
}
