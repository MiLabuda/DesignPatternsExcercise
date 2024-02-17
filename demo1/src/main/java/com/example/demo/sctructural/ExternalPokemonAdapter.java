package com.example.demo.sctructural;

public class ExternalPokemonAdapter implements PokemonInterface {
    private ExternalPokemon externalPokemon;

    public ExternalPokemonAdapter(ExternalPokemon externalPokemon) {
        this.externalPokemon = externalPokemon;
    }

    @Override
    public String getName() {
        return externalPokemon.getName();
    }

    @Override
    public String getType() {
        return externalPokemon.getType();
    }

    @Override
    public int getHealthPoints() {
        // Symulujemy przeliczenie punktów zdrowia z wartości bazowych
        return externalPokemon.getBaseHealth() * 2;
    }

    @Override
    public int getAttack() {
        // Symulujemy przeliczenie ataku z wartości bazowej
        return externalPokemon.getBaseAttack() + 5;
    }

    @Override
    public int getDefense() {
        // Symulujemy przeliczenie obrony z wartości bazowej
        return externalPokemon.getBaseDefense() + 3;
    }

}
