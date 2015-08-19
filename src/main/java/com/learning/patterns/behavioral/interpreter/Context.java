package com.learning.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aliHitawala on 8/19/15.
 */
public class Context {
    Map<String, Boolean> map = new HashMap<String, Boolean>();

    void assign(VariableExp v, boolean b) {
        map.put(v.name, b);
    }

    boolean lookUp(String s) {
        return map.get(s);
    }
}
