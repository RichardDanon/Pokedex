package com.example.pokedex.Controller;


import com.example.pokedex.Request.PokemonRequest;
import com.example.pokedex.Response.PokemonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonController {

    @GetMapping
    public List<PokemonResponse> getAllPokemons(@RequestParam(required = false) String pokemonName){

        return null; //Place Holder
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public PokemonResponse addPokemon(@Valid @RequestBody PokemonRequest teacherRequest){

        return null; //Place Holder

    }
}
