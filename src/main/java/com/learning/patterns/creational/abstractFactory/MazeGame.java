package com.learning.patterns.creational.abstractFactory;

import com.learning.patterns.vo.maze.Direction;
import com.learning.patterns.vo.maze.Door;
import com.learning.patterns.vo.maze.Maze;
import com.learning.patterns.vo.maze.Room;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class MazeGame {
    public Maze createMaze(MazeFactory factory)
    {
        Maze maze = factory.makeMaze();
        Room room1 = factory.makeRoom(1);
        Room room2 = factory.makeRoom(2);
        Door door = factory.makeDoor(room1, room2);
      /**  technical
                leadership
                RRK - teamplayer
                        googliness
                        GCA - cognitive ability - take some time, bombard with questions - ask ask ask
                          (organize games - when, how many, how much budget, location, stuff for marketing, why?
                        culture enhancement - google, Project mgmt - look into it, QUESTIONS, Matrixs driven
                        Steps , project mgr and proj mgmt
                spend time on reading - google products - anti abuse- Adwords, Adsense
                all the list of products by google - wiki
                Anti abuse - extremely technical.
       **/
        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Direction.NORTH, factory.makeWall());
        room1.setSide(Direction.EAST, factory.makeWall());
        room1.setSide(Direction.SOUTH, factory.makeWall());
        room1.setSide(Direction.WEST, door);

        room2.setSide(Direction.NORTH, factory.makeWall());
        room2.setSide(Direction.EAST, door);
        room2.setSide(Direction.SOUTH, factory.makeWall());
        room2.setSide(Direction.WEST, factory.makeWall());

        return maze;
    }
}
