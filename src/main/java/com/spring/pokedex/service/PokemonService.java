package com.spring.pokedex.service;

import com.spring.pokedex.dto.PokemonDTO;
import com.spring.pokedex.entity.Pokemon;
import com.spring.pokedex.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final PokemonRepository repository;

    public List<PokemonDTO> listarPokemons() {
        return repository.findAll()
                .stream()
                .map(PokemonDTO::TwoControllers).collect(Collectors.toList());
    }

    public PokemonDTO add(PokemonDTO dto) {
        Pokemon pokemon = new Pokemon();
        pokemon.setId(dto.getId());
        pokemon.setName(dto.getName());
        pokemon.setType(dto.getType());
        pokemon.setEvolution(dto.getEvolution());
        pokemon.setHeight(dto.getHeight());
        pokemon.setPayload(dto.getPayload());

        Pokemon saved = repository.save(pokemon);

        return new PokemonDTO(saved.getName(),saved.getType(), saved.getEvolution(),saved.getPayload(), saved.getHeight());
    }

    public void delete(Long id) {
        if(!repository.existsById(id)){
            System.out.println("Pokemon não encontrado");
        }
        repository.deleteById(id);
    }

    public Pokemon update(Long id, Pokemon updated){
        Pokemon pokemon = repository.findById(id).orElseThrow();

        if(updated.getName() != null){
            pokemon.setName(updated.getName());
        }

        if(updated.getType() != null){
            pokemon.setType(updated.getType());
        }

        if(updated.getEvolution() <= 0 ){
            pokemon.setEvolution(updated.getEvolution());
        }

        if(updated.getHeight() <= 0){
            pokemon.setHeight(updated.getHeight());
        }

        if(updated.getPayload() <= 0){
            pokemon.setPayload(updated.getPayload());
        }

        Pokemon saved = repository.save(pokemon);
        return repository.findById(saved.getId()).orElseThrow();
    }

}
