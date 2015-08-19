package com.learning.patterns.behavioral.interpreter;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class Runner {
    public static void main(String[] args) {
        Context c = new Context();
        VariableExp v1 = new VariableExp("X");
        VariableExp v2 = new VariableExp("Y");
        c.assign(v1, true);
        c.assign(v2, false);
        BooleanExp expression = new OrExp(new AndExp(new ConstantExp(false), v1),
                new AndExp(v1, new NotExp(v2)));
        boolean value = expression.evaluate(c);
        // (false && v1) || (v1 && !v2)
        // (false && true || true && true) = true
        System.out.println(value);
        VariableExp newExp = new VariableExp("Z");
        c.assign(newExp, true);
        BooleanExp replacement = expression.replace("Y", newExp);
        //(false && false || true && false) = false
        BooleanExp replacement2 = expression.replace("X", new ConstantExp(false));
        // (false && false || false && true) = false
        System.out.println(replacement.evaluate(c));
        System.out.println(replacement2.evaluate(c));
    }
}
