package com.learning.patterns.vo.maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class Door implements MapSite, Cloneable {
    private Room room1;
    private Room room2;
    private boolean isOpen = false;

    public Door(Room r1, Room r2) {
        this.room1 = r1;
        this.room2 = r2;
        System.out.println("Simple Door created between room number " + r1.getNumber() +
                " and room number " + r2.getNumber());
    }


    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    @Override
    public void enter() {
        if (this.isOpen())
        {
            System.out.println("Entered into the door.");
        }
        else
        {
            System.out.println("Door closed cannot enter!");
        }
    }

    //<for prototype creational pattern>
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

    public void initializeRooms(Room room1, Room room2)
    {
        this.room1 = room1;
        this.room2 = room2;
    }

    public Door() {
    }
    //</for prototype creational pattern>
}
