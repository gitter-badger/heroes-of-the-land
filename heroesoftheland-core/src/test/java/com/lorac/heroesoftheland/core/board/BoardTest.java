package com.lorac.heroesoftheland.core.board;

import com.lorac.heroesoftheland.core.tile.Mine;
import com.lorac.heroesoftheland.core.tile.Tavern;
import com.lorac.heroesoftheland.core.tile.Tile;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoardTest {

    private Board board;
    private List<Tile> tiles;

    @Test
    public void testCountMinesOf() throws Exception {
        create6Tiles5MineForPlayer1And1Tavern();

        board = new Board(tiles);

        assertEquals(5, board.countMinesOf(1));
    }

    private void create6Tiles5MineForPlayer1And1Tavern() {
        tiles = new ArrayList<Tile>() {{
            add(new Mine('1'));
            add(new Mine('1'));
            add(new Mine('1'));
            add(new Mine('1'));
            add(new Mine('1'));
            add(new Tavern());
        }};
    }
}