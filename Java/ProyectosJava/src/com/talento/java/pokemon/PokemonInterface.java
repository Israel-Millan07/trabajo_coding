package com.talento.java.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, int health, String type);
	void pokemonInfo(Pokemon pokemon);
	void listPokemon();
}
