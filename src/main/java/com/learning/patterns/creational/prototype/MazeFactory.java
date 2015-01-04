package com.learning.patterns.creational.prototype;

import com.learning.patterns.vo.maze.Door;
import com.learning.patterns.vo.maze.Maze;
import com.learning.patterns.vo.maze.Room;
import com.learning.patterns.vo.maze.Wall;

/**
 * Created by aliHitawala on 1/4/15.
 */
public class MazeFactory {
    public Maze makeMaze()
    {
        return new Maze();
    }

    public Room makeRoom(int num)
    {
        return new Room(num);
    }

    public Door makeDoor(Room room1, Room room2)
    {
        return new Door(room1, room2);
    }

    public Wall makeWall()
    {
        return new Wall();
    }
}
