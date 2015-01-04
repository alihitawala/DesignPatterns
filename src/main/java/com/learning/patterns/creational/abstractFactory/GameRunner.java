package com.learning.patterns.creational.abstractFactory;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class GameRunner {
    public static void main(String[] args) {
        //default factory passed
        MazeFactory factory = new MazeFactory();
        MazeGame game = new MazeGame();
        game.createMaze(factory);

        //enchanted factory passed to create enchanted maze
        factory = new EnchantedMazeFactory();
        MazeGame game2 = new MazeGame();
        game2.createMaze(factory);

        //bombed factory passed to create bombed maze
        factory = new BombedMazeFactory();
        MazeGame game3 = new MazeGame();
        game3.createMaze(factory);
    }
}
