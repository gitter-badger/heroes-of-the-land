package com.lorac.heroesoftheland.core.board;

public class BoardGenerator {

    private int baseSize = 10;
    private int baseMinePercentage = 10;
    private int baseWallPercentage = 3;
    private int turns;

    public BoardGenerator(int turns) {
        this.turns = turns;
    }

}
