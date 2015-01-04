package com.learning.patterns.creational.factoryMethod;

import com.learning.patterns.vo.maze.Door;
import com.learning.patterns.vo.maze.DoorNeedingSpell;
import com.learning.patterns.vo.maze.EnchantedRoom;
import com.learning.patterns.vo.maze.Room;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class EnchantedMazeGame extends MazeGame {
    @Override
    public Room makeRoom(int num) {
        return new EnchantedRoom(num);
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2);
    }
}
