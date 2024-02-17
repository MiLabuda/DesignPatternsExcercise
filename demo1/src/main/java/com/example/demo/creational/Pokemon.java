package com.example.demo.creational;

import java.util.UUID;

public class Pokemon {
    private UUID id;
    private String name;
    private String type;
    private String abilities;
    private int level;
    private int healthPoints;
    private int attack;
    private int defense;
    private int speed;
    private int experience;
    private String region;
    private String trainer;

    // Prywatny konstruktor, aby wymusić korzystanie z Buildera
    private Pokemon(Builder builder) {
        this.id = builder.id != null ? builder.id : UUID.randomUUID();
        this.name = builder.name;
        this.type = builder.type;
        this.abilities = builder.abilities;
        this.level = builder.level;
        this.healthPoints = builder.healthPoints;
        this.attack = builder.attack;
        this.defense = builder.defense;
        this.speed = builder.speed;
        this.experience = builder.experience;
        this.region = builder.region;
        this.trainer = builder.trainer;
    }

    // Getter-y dla pól

    public static class Builder {
        private UUID id;
        private String name;
        private String type;
        private String abilities;
        private int level;
        private int healthPoints;
        private int attack;
        private int defense;
        private int speed;
        private int experience;
        private String region;
        private String trainer;

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder abilities(String abilities) {
            this.abilities = abilities;
            return this;
        }

        public Builder level(int level) {
            this.level = level;
            return this;
        }

        public Builder healthPoints(int healthPoints) {
            this.healthPoints = healthPoints;
            return this;
        }

        public Builder attack(int attack) {
            this.attack = attack;
            return this;
        }

        public Builder defense(int defense) {
            this.defense = defense;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder experience(int experience) {
            this.experience = experience;
            return this;
        }

        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public Builder trainer(String trainer) {
            this.trainer = trainer;
            return this;
        }

        public Pokemon build() {
            return new Pokemon(this);
        }
    }
}


//Pokemon.Builder builder = new Pokemon.Builder("Charmander");
//Pokemon charmander = builder
//        .type("Fire")
//        .level(15)
//        .healthPoints(40)
//        .attack(25)
//        .defense(18)
//        .speed(30)
//        .experience(80)
//        .region("Kanto")
//        .trainer("TrainerABC")
//        .build();

