package com.spring.pokedex.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column
    String name;

    @Column
    List<Enum> type;

    @Column
    int evolution;

    @Column
    float height;

    @Column
    float payload;

}
