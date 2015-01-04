package com.learning.patterns.creational.factoryMethod;

import com.learning.patterns.vo.maze.*;

/**
 * Created by aliHitawala on 1/3/15.
 */
public abstract class MazeGame {
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

    public Maze createMaze()
    {
        Maze maze = this.makeMaze();
        Room room1 = this.makeRoom(1);
        Room room2 = this.makeRoom(2);
        Door door = this.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, this.makeWall());
        room1.setSide(Direction.EAST, this.makeWall());
        room1.setSide(Direction.SOUTH, this.makeWall());
        room1.setSide(Direction.WEST, door);

        room2.setSide(Direction.NORTH, this.makeWall());
        room2.setSide(Direction.EAST, door);
        room2.setSide(Direction.SOUTH, this.makeWall());
        room2.setSide(Direction.WEST, this.makeWall());

        return maze;
    }
}