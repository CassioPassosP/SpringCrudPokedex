package com.spring.pokedex.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Formula;

import java.util.List;

@Data
@Entity
@Table(name = "pokemon_type")
public class Pokemon_type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long type_id;

    @Column
    String name;

    @ManyToOne
    @JoinColumn(name = "pokemon_id", referencedColumnName = "id")
    Pokemon pokemonId;

}
