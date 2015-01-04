package com.learning.patterns.creational.prototype;

import com.learning.patterns.vo.maze.*;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class GameRunner {
    public static void main(String[] args) {
        //default factory passed
        MazeFactory factory = new MazeFactory();
        MazeGame game = new MazeGame();
        game.createMaze(factory);

        //prototype factory passed
        MazeFactory simplePrototypeFactory = new MazePrototypeFactory(new Maze(), new Room(1),
                new Door(), new Wall());
        MazeGame game1 = new MazeGame();
        game1.createMaze(simplePrototypeFactory);

        //enchanted prototype factory passed
        MazeFactory enchantedPrototypeFactory = new MazePrototypeFactory(new Maze(), new EnchantedRoom(1),
                new DoorNeedingSpell(), new Wall());
        MazeGame game2 = new MazeGame();
        game2.createMaze(enchantedPrototypeFactory);
    }
}
