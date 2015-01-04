package com.learning.patterns.creational.builder;

import com.learning.patterns.vo.maze.*;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class StandardMazeBuilder implements MazeBuilder {

    private Maze currentMaze;

    @Override
    public void buildMaze() {
        this.currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int num) {
        if (currentMaze != null)
        {
            Room room = new Room(num);
            currentMaze.addRoom(room);
            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.EAST, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
            room.setSide(Direction.WEST, new Wall());
        }
    }

    @Override
    public void buildDoor(int r1, int r2) {
        Room room1 = this.currentMaze.getRoom(r1);
        Room room2 = this.currentMaze.getRoom(r2);
        Door door = new Door(room1, room2);
        room1.setSide(this.commonWall(room1, room2), door);
        room2.setSide(this.commonWall(room2, room1), door);
    }

    @Override
    public Maze getMaze()
    {
        return this.getCurrentMaze();
    }

    private Direction commonWall(Room room1, Room room2)
    {
        Direction result = Direction.EAST;
        if (room1.getNumber() == 1 && room2.getNumber() == 2)
        {
            result = Direction.EAST;
        }
        else if (room1.getNumber() ==2 && room2.getNumber() == 1)
        {
            result = Direction.WEST;
        }
        return result;
    }

    public Maze getCurrentMaze() {
        return this.currentMaze;
    }
}
