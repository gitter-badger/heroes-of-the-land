package com.lorac.heroesoftheland.core.hero;

import com.lorac.heroesoftheland.core.Position;

public abstract class Hero {

    protected static int DEFEND_LIFE = -20;
    protected static int MAX_LIFE = 100;
    protected int life;
    protected Position position;

    public Hero(int life, Position position) {
        this.life = life;
        this.position = position;
    }
}
