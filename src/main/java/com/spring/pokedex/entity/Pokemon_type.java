package com.spring.pokedex.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pokemon_type")
public class Pokemon_type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column
    String name;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    List<Pokemon> Pokemons;

}
