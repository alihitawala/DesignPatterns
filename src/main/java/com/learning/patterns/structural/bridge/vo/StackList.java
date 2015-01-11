package com.learning.patterns.structural.bridge.vo;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class StackList implements StackImpl {
    private Node last;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) return -1;
        return last.value;
    }

    public int pop() {
        if (isEmpty()) return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }
}
