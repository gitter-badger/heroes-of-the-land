package com.lorac.heroesoftheland.core.tile;

public class Tavern extends Tile {
    public Tavern() {
        super('[', ']');
    }

    @Override
    public boolean isPassable() {
        return false;
    }
}
