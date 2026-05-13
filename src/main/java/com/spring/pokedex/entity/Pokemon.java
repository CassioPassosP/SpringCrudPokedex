package com.spring.pokedex.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type")
    Pokemon_type type;

    @Column
    int evolution;

    @Column
    float height;

    @Column
    float payload;

}
