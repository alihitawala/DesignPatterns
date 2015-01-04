package com.learning.patterns.vo.maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class EnchantedRoom extends Room implements Cloneable {
    public EnchantedRoom(int num) {
        super(num);
        System.out.println("Enchanted Room created. Room number : " + num);
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
