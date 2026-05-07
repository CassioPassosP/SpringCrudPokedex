package com.spring.pokedex.repository;

import com.spring.pokedex.entity.Pokemon;
import com.spring.pokedex.entity.Pokemon_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{
}
