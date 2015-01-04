package com.learning.patterns.creational.singleton;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class GameRunner {
    public static void main(String[] args) {
        //default factory passed - singleton
        MazeFactory factory = MazeFactory.getInstance();
        MazeGame game = new MazeGame();
        game.createMaze(factory);
    }
}
