package com.learning.patterns.creational.plain;

import com.learning.patterns.vo.maze.*;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class MazeGame {

    public Maze createMaze()
    {
        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door door = new Door(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, new Wall());
        room1.setSide(Direction.EAST, new Wall());
        room1.setSide(Direction.SOUTH, new Wall());
        room1.setSide(Direction.WEST, door);

        room2.setSide(Direction.NORTH, new Wall());
        room2.setSide(Direction.EAST, door);
        room2.setSide(Direction.SOUTH, new Wall());
        room2.setSide(Direction.WEST, new Wall());

        return maze;
    }

    public static void main(String[] args) {
        MazeGame game = new MazeGame();
        game.createMaze();
    }
}
