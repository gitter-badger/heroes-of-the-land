package com.lorac.heroesoftheland.core.board;

import com.lorac.heroesoftheland.core.Position;
import com.lorac.heroesoftheland.core.tile.Mine;
import com.lorac.heroesoftheland.core.tile.Tile;

import java.util.List;

import static java.lang.StrictMath.sqrt;

public class Board {

    private List<Tile> tiles;

    public Board(List<Tile> tiles) {
        this.tiles = tiles;
    }

    public void update(Position position, Tile tile) {
        tiles.set(position.getY() * (int) sqrt(tiles.size()) + position.getX(), tile);
    }

    public int countMines() {
        return (int) tiles.stream().filter(t -> t instanceof Mine).count();
    }

    public int countMinesOf(int playerId) {
        return (int) tiles.stream()
                .filter(t -> t instanceof Mine)
                .filter(t -> t.equals(new Mine(String.valueOf(playerId).charAt(0))))
                .count();
    }

}
