package com.learning.patterns.behavioral.interpreter;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class OrExp implements BooleanExp{
    private BooleanExp one;
    private BooleanExp two;

    public OrExp(BooleanExp one, BooleanExp two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public boolean evaluate(Context c) {
        return one.evaluate(c) || two.evaluate(c);
    }

    @Override
    public BooleanExp replace(String s, BooleanExp b) {
        return new OrExp(this.one.replace(s, b), this.two.replace(s, b));
    }

    @Override
    public BooleanExp copy() {
        return new OrExp(this.one.copy(), this.two.copy());
    }
}
