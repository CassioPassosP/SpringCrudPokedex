package com.spring.pokedex.dto;

import java.util.List;

public class PokemonDTO {
    Long Id;
    String name;
    List<Enum> type;
    int evolution;
    float height;
    float payload;

    public PokemonDTO(Long id, String name, List<Enum> type, int evolution, float height, float payload) {
        Id = id;
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
}
