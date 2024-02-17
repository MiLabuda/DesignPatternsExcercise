package com.example.demo.sctructural;

public class ExternalPokemon {
    private String name;
    private String type;
    private int baseHealth;
    private int baseAttack;
    private int baseDefense;

    public ExternalPokemon(String name, String type, int baseHealth, int baseAttack, int baseDefense) {
        this.name = name;
        this.type = type;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefense() {
        return baseDefense;
    }
}

