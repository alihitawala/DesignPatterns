package com.learning.patterns.structural.bridge.vo;

/**
 * Created by aliHitawala on 1/10/15.
 */
public class Stack {
    private StackImpl stackImpl;

    public Stack(String id) {
        if ("array".equalsIgnoreCase(id))
        {
            stackImpl = new StackArray();
        }
        else if ("list".equalsIgnoreCase(id))
        {
            stackImpl = new StackList();
        }
    }

    public Stack() {
        this("array");
    }

    public void push(int i)
    {
        stackImpl.push(i);
    }

    public int pop()
    {
        return stackImpl.pop();
    }

    public int top()
    {
        return stackImpl.top();
    }

    public boolean isEmpty()
    {
        return stackImpl.isEmpty();
    }

    public boolean isFull()
    {
        return stackImpl.isFull();
    }
}
