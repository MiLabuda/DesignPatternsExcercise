package com.example.demo.sctructural;


public class PokemonGame {
    public static void main(String[] args) {
        // Przykładowy obiekt ExternalPokemon
        ExternalPokemon externalPokemon = new ExternalPokemon("Pikachu", "Electric", 30, 25, 20);

        // Adapter dla ExternalPokemon
        ExternalPokemonAdapter adaptedPokemon = new ExternalPokemonAdapter(externalPokemon);

        // Używamy Pokemon w naszej grze
        System.out.println("Name: " + adaptedPokemon.getName());
        System.out.println("Type: " + adaptedPokemon.getType());
        System.out.println("Health Points: " + adaptedPokemon.getHealthPoints());
        System.out.println("Attack: " + adaptedPokemon.getAttack());
        System.out.println("Defense: " + adaptedPokemon.getDefense());
    }
}

