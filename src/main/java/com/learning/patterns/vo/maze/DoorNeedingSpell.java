package com.learning.patterns.vo.maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class DoorNeedingSpell extends Door implements Cloneable {
    public DoorNeedingSpell(Room r1, Room r2) {
        super(r1, r2);
        System.out.println("Door Needing spell created between room number " + r1.getNumber() +
                " and room number " + r2.getNumber());
    }

    public DoorNeedingSpell() {
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
