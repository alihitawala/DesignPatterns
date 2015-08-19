package com.learning.patterns.behavioral.interpreter;

/**
 * Created by aliHitawala on 8/19/15.
 */
public interface BooleanExp {
    boolean evaluate(Context c);
    BooleanExp replace(String s, BooleanExp b);
    BooleanExp copy();
}
