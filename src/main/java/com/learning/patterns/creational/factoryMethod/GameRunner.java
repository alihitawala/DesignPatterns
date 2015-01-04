package com.learning.patterns.creational.factoryMethod;



/**
 * Created by aliHitawala on 1/3/15.
 */
public class GameRunner {
    public static void main(String[] args) {
        MazeGame game = ParameterizedFactoryMethod.getInstance().getMazeGameInstance(1);
        game.createMaze();

        MazeGame game2 = ParameterizedFactoryMethod.getInstance().getMazeGameInstance(2);
        game2.createMaze();
    }
}