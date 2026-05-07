package com.spring.pokedex.controller;

import com.spring.pokedex.dto.PokemonDTO;
import com.spring.pokedex.entity.Pokemon;
import com.spring.pokedex.service.PokemonService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public List<PokemonDTO> listar() {
        return service.listarPokemons();
    }

    @PostMapping
    public ResponseEntity<PokemonDTO> adicionar(@RequestBody PokemonDTO dto) {
        PokemonDTO created = service.add(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        service.delete(id);

        return ResponseEntity.accepted().body("Pokemon id: " + id + " deletado ");
    }

    @PutMapping("/{id}")
    public Pokemon atualizar(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        return service.update(id, pokemon);
    }

}
