package com.learning.patterns.creational.builder;

import com.learning.patterns.vo.maze.Maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class GameRunner {


    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        StandardMazeBuilder builder = new StandardMazeBuilder();
        Maze maze = mazeGame.createMaze(builder);

        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        maze = mazeGame.createMaze(countingMazeBuilder);
        System.out.println("Number of Rooms created : " + countingMazeBuilder.componentCounts().getRoomCount());
        System.out.println("Number of Doors created : " + countingMazeBuilder.componentCounts().getDoorCount());
    }
}
