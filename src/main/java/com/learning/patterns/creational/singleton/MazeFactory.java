package com.learning.patterns.creational.singleton;

import com.learning.patterns.vo.maze.Door;
import com.learning.patterns.vo.maze.Maze;
import com.learning.patterns.vo.maze.Room;
import com.learning.patterns.vo.maze.Wall;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class MazeFactory {
    private static MazeFactory self;

    protected MazeFactory(){}

    //not thread safe - can be implemented in a double lock fashion
    public static MazeFactory getInstance()
    {
        if (self == null)
        {
            self = new MazeFactory();
        }
        return self;
    }

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
