package com.lorac.heroesoftheland.core.tile;

public class Mine extends Tile {

    public Mine(char owner) {
        super('$', owner);
    }

    @Override
    public boolean isPassable() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mine) {
            Mine aMine = (Mine) obj;
            if (aMine.secondCharacter == this.secondCharacter) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
