package com.learning.patterns.structural.bridge.vo;

/**
 * Created by aliHitawala on 1/10/15.
 */
public interface StackImpl {
    void push( int i );
    int pop();
    int top();
    boolean isEmpty();
    boolean isFull();
}
