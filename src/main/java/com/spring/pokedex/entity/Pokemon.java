package com.spring.pokedex.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

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
