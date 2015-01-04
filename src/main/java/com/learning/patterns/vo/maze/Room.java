package com.learning.patterns.vo.maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class Room implements MapSite, Cloneable{
    private MapSite[] neighbors = new MapSite[4];
    private final int number;
    public Room(int num) {
        this.number = num;
        System.out.println("Simple Room created. Room number : " + num);
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void enter() {
        System.out.println("Entering the Room.");
    }

    public void setSide(Direction direction, MapSite mapSite)
    {
        neighbors[direction.ordinal()] = mapSite;
    }

    public MapSite getSide(Direction direction)
    {
        return neighbors[direction.ordinal()];
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
