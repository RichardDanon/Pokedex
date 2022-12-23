package com.example.pokedex.Service;

import com.example.pokedex.Entity.*;
import com.example.pokedex.Exception.UnprocessableEntityException;
import com.example.pokedex.Repository.*;
import com.example.pokedex.Request.PokemonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    @Autowired
    RegionRepository regionRepository;

    @Autowired
    TypeRepository typeRepository;

    public List<Pokemon> getAllPokemon(){
        return (List<Pokemon>) pokemonRepository.findAll();
    }

    public Pokemon addPokemon(PokemonRequest pokemonRequest) {

        Pokemon pokemon = new Pokemon(pokemonRequest);
        Region region = regionRepository.findById(pokemonRequest.getRegion().getId()).orElseThrow(() ->
                new UnprocessableEntityException("Region ID not found"));

        Type primaryType = typeRepository.findById(pokemonRequest.getPrimaryType().getId()).orElseThrow(() ->
                new UnprocessableEntityException("Primary type ID not found"));

        Type secondaryType = typeRepository.findById(pokemonRequest.getSecondaryType().getId()).orElse(null);

        pokemon.setRegion(region);
        pokemon.setPrimaryType(primaryType);
        pokemon.setSecondaryType(secondaryType);


        return pokemonRepository.save(pokemon);
    }

    public Pokemon updateTeacher(long pokemonId, PokemonRequest pokemonRequest) {

        pokemonRepository.findById(pokemonId);
                //.orElseThrow(() -> new ResourceNotFoundException("Pokemon ID is no found. "));

        Pokemon pokemonToBeUpdated = new Pokemon();
        pokemonToBeUpdated.setId(pokemonId);

        return pokemonRepository.save(pokemonToBeUpdated);
    }
}
