package com.learning.patterns.creational.prototype;

import com.learning.patterns.vo.maze.Door;
import com.learning.patterns.vo.maze.Maze;
import com.learning.patterns.vo.maze.Room;
import com.learning.patterns.vo.maze.Wall;

/**
 * Created by aliHitawala on 1/4/15.
 */
public class MazePrototypeFactory extends MazeFactory implements Cloneable {
    private Maze prototypeMaze;
    private Room prototypeRoom;
    private Door prototypeDoor;
    private Wall prototypeWall;

    public MazePrototypeFactory(Maze prototypeMaze, Room prototypeRoom, Door prototypeDoor, Wall prototypeWall) {
        this.prototypeMaze = prototypeMaze;
        this.prototypeRoom = prototypeRoom;
        this.prototypeDoor = prototypeDoor;
        this.prototypeWall = prototypeWall;
    }

    @Override
    public Maze makeMaze() {
       return (Maze) prototypeMaze.clone();
    }

    @Override
    public Room makeRoom(int num) {
        return (Room) prototypeRoom.clone();
    }

    @Override
    public Door makeDoor(Room room1, Room room2) {
        Door door = (Door) prototypeDoor.clone();
        door.initializeRooms(room1, room2);
        return door;
    }

    @Override
    public Wall makeWall() {
        return (Wall) prototypeWall.clone();
    }
}
