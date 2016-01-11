package com.lorac.heroesoftheland.core;

public enum Direction {
    NORTH("North"),
    SOUTH("South"),
    WEST("West"),
    EAST("East"),
    STAY("Stay");

    private String value;

    Direction(String value) {
        this.value = value;
    }
}
