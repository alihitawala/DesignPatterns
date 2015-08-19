package com.learning.patterns.behavioral.interpreter;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class VariableExp implements BooleanExp {
    protected String name;

    public VariableExp(String name) {
        this.name = name;
    }

    @Override
    public boolean evaluate(Context c) {
        return c.lookUp(name);
    }

    @Override
    public BooleanExp replace(String s, BooleanExp b) {
        if (name.equals(s))
            return b.copy();
        return new VariableExp(this.name);
    }

    @Override
    public BooleanExp copy() {
        return new VariableExp(name);
    }
}
