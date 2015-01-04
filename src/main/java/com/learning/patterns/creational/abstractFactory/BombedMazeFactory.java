package com.learning.patterns.creational.abstractFactory;

import com.learning.patterns.vo.maze.BombedWall;
import com.learning.patterns.vo.maze.Room;
import com.learning.patterns.vo.maze.RoomWithABomb;
import com.learning.patterns.vo.maze.Wall;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class BombedMazeFactory extends MazeFactory {
    @Override
    public Room makeRoom(int num) {
        return new RoomWithABomb(num);
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }
}
