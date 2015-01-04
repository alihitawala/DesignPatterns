package com.learning.patterns.vo.maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class BombedWall extends Wall {
    public BombedWall()
    {
        System.out.println("Bombed wall created");
    }

    @Override
    public void enter() {
        System.out.println("Bomb exploded. You tried to enter a Bombed wall");
    }
}
