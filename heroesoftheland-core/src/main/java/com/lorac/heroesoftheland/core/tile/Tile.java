package com.lorac.heroesoftheland.core.tile;

public abstract class Tile {
    protected final char firstCharacter;
    protected final char secondCharacter;

    public Tile(char firstCharacter, char secondCharacter) {
        this.firstCharacter = firstCharacter;
        this.secondCharacter = secondCharacter;
    }

    public abstract boolean isPassable();
}
