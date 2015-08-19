package com.learning.patterns.behavioral.interpreter;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class ConstantExp implements BooleanExp{
    private boolean value;

    public ConstantExp(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(Context c) {
        return this.value;
    }

    @Override
    public BooleanExp replace(String s, BooleanExp b) {
        return new ConstantExp(this.value);
    }

    @Override
    public BooleanExp copy() {
        return new ConstantExp(this.value);
    }
}
