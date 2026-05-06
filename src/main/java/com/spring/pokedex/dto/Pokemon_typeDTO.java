package com.spring.pokedex.dto;

import com.spring.pokedex.entity.Pokemon;

import java.util.List;

public class Pokemon_typeDTO {
    Long Id;
    String name;
    List<Pokemon> Pokemons;

    public Pokemon_typeDTO(Long id, String name, List<Pokemon> pokemons) {
        Id = id;
        this.name = name;
        Pokemons = pokemons;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return Pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        Pokemons = pokemons;
    }
}
