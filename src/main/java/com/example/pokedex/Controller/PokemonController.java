package com.example.pokedex.Controller;


import com.example.pokedex.Entity.*;
import com.example.pokedex.Request.PokemonRequest;
import com.example.pokedex.Response.PokemonResponse;
import com.example.pokedex.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    @Autowired
    PokemonService pokemonService;

    @GetMapping
    public List<PokemonResponse> getAllPokemon(){

        List<Pokemon> pokemons = pokemonService.getAllPokemon();
        List<PokemonResponse> pokemonResponses = new ArrayList<>();

        pokemons.forEach(pokemon -> {
            PokemonResponse pokemonResponse = new PokemonResponse(pokemon);
            pokemonResponses.add(pokemonResponse);
        });

        return pokemonResponses;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public PokemonResponse addPokemon(@Valid @RequestBody PokemonRequest pokemonRequest){

        Pokemon savedPokemon = pokemonService.addPokemon(pokemonRequest);

        return new PokemonResponse(savedPokemon);
    }

    @PutMapping("/{id}")
    public PokemonResponse updateTeacher(@PathVariable long id, @Valid @RequestBody PokemonRequest pokemonRequest){

        Pokemon updatedPokemon = pokemonService.updatePokemon(id, pokemonRequest);

        return new PokemonResponse(updatedPokemon);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePokemon(@PathVariable long id) {
        pokemonService.deletePokemon(id);
    }

}
