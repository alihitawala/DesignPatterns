package com.learning.patterns.vo.maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class Wall implements MapSite, Cloneable{
    public Wall() {
        System.out.println("Simple wall created.");
    }

    @Override
    public void enter() {
        System.out.println("You cannot enter here. ERROR!");
    }

    @Override
    public Object clone() {
        Object result = null;
        try {
            result = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
