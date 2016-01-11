package com.lorac.heroesoftheland.core;

import com.lorac.heroesoftheland.core.board.Board;

public class Game {

    private Team team1;
    private Team team2;
    private Team team3;
    private Team team4;
    private Board board;
    private int turn = 0;

    public Game(Team team1, Team team2, Team team3, Team team4, Board board) {
        this.team1 = team1;
        this.team2 = team2;
        this.team3 = team3;
        this.team4 = team4;
        this.board = board;
    }
}
