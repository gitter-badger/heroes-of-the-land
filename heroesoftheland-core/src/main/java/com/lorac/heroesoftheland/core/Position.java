package com.lorac.heroesoftheland.core;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void to(Direction direction) {
        if (direction == Direction.NORTH) {
            moveNorth();
        } else if (direction == Direction.SOUTH) {
            moveSouth();
        } else if (direction == Direction.EAST) {
            moveEast();
        } else if (direction == Direction.WEST) {
            moveWest();
        }
    }

    public void moveNorth() {
        x--;
    }

    public void moveSouth() {
        x++;
    }

    public void moveEast() {
        y++;
    }

    public void moveWest() {
        y--;
    }
}
