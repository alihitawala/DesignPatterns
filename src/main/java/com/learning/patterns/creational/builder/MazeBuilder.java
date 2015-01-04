package com.learning.patterns.creational.builder;

import com.learning.patterns.vo.maze.Maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public interface MazeBuilder {
    void buildMaze();
    void buildRoom(int num);
    void buildDoor(int r1, int r2);
    Maze getMaze();
}
