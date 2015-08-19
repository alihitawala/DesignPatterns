package com.learning.patterns.behavioral.interpreter;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class NotExp implements BooleanExp{
    private BooleanExp one;

    public NotExp(BooleanExp one) {
        this.one = one;
    }

    @Override
    public boolean evaluate(Context c) {
        return !one.evaluate(c);
    }

    @Override
    public BooleanExp replace(String s, BooleanExp b) {
        return new NotExp(this.one.replace(s, b));
    }

    @Override
    public BooleanExp copy() {
        return new NotExp(this.one.copy());
    }
}
