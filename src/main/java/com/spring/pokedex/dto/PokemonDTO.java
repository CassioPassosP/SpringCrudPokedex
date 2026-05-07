package com.spring.pokedex.dto;

import com.spring.pokedex.entity.Pokemon;

import java.util.List;

public class PokemonDTO {
    Long Id;
    String name;
    List<Enum> type;
    int evolution;
    float height;
    float payload;

    public PokemonDTO(String name, List<Enum> type, int evolution, float height, float payload) {
        this.name = name;
        this.type = type;
        this.evolution = evolution;
        this.height = height;
        this.payload = payload;
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

    public List<Enum> getType() {
        return type;
    }

    public void setType(List<Enum> type) {
        this.type = type;
    }

    public int getEvolution() {
        return evolution;
    }

    public void setEvolution(int evolution) {
        this.evolution = evolution;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPayload() {
        return payload;
    }

    public void setPayload(float payload) {
        this.payload = payload;
    }

    public static PokemonDTO TwoControllers(Pokemon pokemon){
        return new PokemonDTO(pokemon.getName(), pokemon.getType(), pokemon.getEvolution(), pokemon.getHeight(), pokemon.getPayload());
    }
}
