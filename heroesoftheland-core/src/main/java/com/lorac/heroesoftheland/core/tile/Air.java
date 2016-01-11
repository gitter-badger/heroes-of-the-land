package com.lorac.heroesoftheland.core.tile;

public class Air extends Tile {
    public Air() {
        super(' ', ' ');
    }

    @Override
    public boolean isPassable() {
        return true;
    }
}
