package com.learning.patterns.structural.bridge.vo;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class StackFIFO extends Stack {

    private StackImpl temp = new StackList();

    public StackFIFO() {
        super("array");
    }

    public StackFIFO(String s) {
        super(s);
    }

    public int pop() {
        while (!isEmpty()) {
            temp.push(super.pop());
        }
        int ret = temp.pop();
        while (!temp.isEmpty()) {
            push(temp.pop());
        }
        return ret;
    }
}
