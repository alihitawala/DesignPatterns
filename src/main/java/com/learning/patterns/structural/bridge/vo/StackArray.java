package com.learning.patterns.structural.bridge.vo;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class StackArray implements StackImpl {
    private int[] items = new int[12];
    private int total = -1;

    public void push(int i) {
        if (!isFull()) {
            items[++total] = i;
        }
    }

    public boolean isEmpty() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    public int top() {
        if (isEmpty()) return -1;
        return items[total];
    }

    public int pop() {
        if (isEmpty()) return -1;
        return items[total--];
    }
}
