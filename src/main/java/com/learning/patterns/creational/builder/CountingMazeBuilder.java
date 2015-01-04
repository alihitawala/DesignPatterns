package com.learning.patterns.creational.builder;

import com.learning.patterns.vo.maze.Maze;

/**
 * Created by aliHitawala on 1/3/15.
 */
public class CountingMazeBuilder implements MazeBuilder {

    private int roomCount = 0;
    private int doorCount = 0;
    private Maze currentMaze;

    @Override
    public void buildMaze() {
        this.currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int num) {
        this.roomCount++;
    }

    @Override
    public void buildDoor(int r1, int r2) {
        this.doorCount++;
    }

    @Override
    public Maze getMaze() {
        return this.currentMaze;
    }

    public MazeComponent componentCounts()
    {
        return new MazeComponent(this.roomCount, this.doorCount);
    }

    static class MazeComponent
    {
        int roomCount;
        int doorCount;

        MazeComponent(int roomCount, int doorCount) {
            this.roomCount = roomCount;
            this.doorCount = doorCount;
        }

        MazeComponent() {
        }

        public int getRoomCount() {
            return roomCount;
        }

        public void setRoomCount(int roomCount) {
            this.roomCount = roomCount;
        }

        public int getDoorCount() {
            return doorCount;
        }

        public void setDoorCount(int doorCount) {
            this.doorCount = doorCount;
        }
    }
}
