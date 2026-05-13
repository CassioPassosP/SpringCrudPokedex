package com.spring.pokedex.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.pokedex.enums.pokemonTypes;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "pokemon_type")
public class Pokemon_type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long type_id;

    @Enumerated(EnumType.STRING)
    pokemonTypes name;

    @JsonIgnore
    @OneToMany(mappedBy = "type")
    List<Pokemon> pokemons;

}
