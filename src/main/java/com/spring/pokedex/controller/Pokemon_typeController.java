package com.spring.pokedex.controller;

import com.spring.pokedex.dto.PokemonDTO;
import com.spring.pokedex.dto.Pokemon_typeDTO;
import com.spring.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon_type")
public class Pokemon_typeController {
    @Autowired
    private PokemonService service;

    @GetMapping
    public List<Pokemon_typeDTO> listar() {
        //return service.listar();
        return null;
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Pokemon_typeDTO> obterPorId(@PathVariable Long id) {
//        Pokemon_typeDTO dto = service.obterPorId(id);
//        if (dto != null) {
//            return ResponseEntity.ok(dto);
//        }
//        return ResponseEntity.notFound().build();
//    }

//    @PostMapping
//    public ResponseEntity<Pokemon_typeDTO> criar(@RequestBody Pokemon_typeDTO dto) {
//        Pokemon_typeDTO created = service.criar(dto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(created);
//    }
}
