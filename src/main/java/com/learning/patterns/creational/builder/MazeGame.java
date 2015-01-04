package com.learning.patterns.creational.builder;

import com.learning.patterns.vo.maze.Maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class MazeGame {

    public Maze createMaze(MazeBuilder builder)
    {
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
        return builder.getMaze();
    }
}
