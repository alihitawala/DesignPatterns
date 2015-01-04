package com.learning.patterns.vo.maze;

import com.gs.collections.api.block.predicate.Predicate;
import com.gs.collections.api.list.MutableList;
import com.gs.collections.impl.list.mutable.FastList;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class Maze implements Cloneable{

    private MutableList<Room> rooms = FastList.newList();
    public Maze() {
        System.out.println("Simple Maze created");
    }

    public void addRoom(Room r1)
    {
        if (getRoom(r1.getNumber()) == null)
        {
            rooms.add(r1);
        }
    }

    public Room getRoom(final int number)
    {
        return rooms.detect(new Predicate<Room>() {
            @Override
            public boolean accept(Room room) {
                return room.getNumber() == number;
            }
        });
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
