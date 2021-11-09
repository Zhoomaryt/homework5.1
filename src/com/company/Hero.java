package com.company;

public class Hero {
    private int health;
    private int damage;
    private String power;
    private String name;

    public String getName() {
        return name;
    }

    public Hero(int health, int damage, String power, String name) {
        this.health = health;
        this.damage = damage;
        this.power = power;
        this.name = name;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getPower() {
        return power;
    }


}

