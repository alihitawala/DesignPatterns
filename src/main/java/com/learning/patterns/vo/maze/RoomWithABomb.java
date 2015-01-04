package com.learning.patterns.vo.maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class RoomWithABomb extends Room{
    public RoomWithABomb(int num) {
        super(num);
        System.out.println("Bomb Room created. Room number : " + num);
    }
}
