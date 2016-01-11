package com.lorac.heroesoftheland.core.tile;

public class Wall extends Tile {
    public Wall() {
        super('#', '#');
    }

    @Override
    public boolean isPassable() {
        return false;
    }
}
