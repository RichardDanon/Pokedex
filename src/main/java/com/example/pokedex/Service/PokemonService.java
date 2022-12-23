package com.example.pokedex.Service;

import com.example.pokedex.Entity.*;
import com.example.pokedex.Exception.*;
import com.example.pokedex.Repository.*;
import com.example.pokedex.Request.PokemonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        assignAssociations(pokemonRequest, pokemon);


        return pokemonRepository.save(pokemon);
    }

    public Pokemon updatePokemon(long pokemonId, PokemonRequest pokemonRequest) {

        Pokemon pokemon = pokemonRepository.findById(pokemonId).orElseThrow(() ->
                new ResourceNotFoundException("Pokemon ID not found"));

        Pokemon updatedPokemon = new Pokemon(pokemonRequest);
        assignAssociations(pokemonRequest, updatedPokemon);

        updatedPokemon.setId(pokemonId);

        return pokemonRepository.save(updatedPokemon);
    }

    public void deletePokemon(long pokemonId) {

        if (pokemonRepository.existsById(pokemonId)) {
            pokemonRepository.deleteById(pokemonId);
        } else {
            throw new ResourceNotFoundException("Pokemon id not found");
        }
    }

    private void assignAssociations(PokemonRequest pokemonRequest, Pokemon pokemon) {
        Region region = regionRepository.findById(pokemonRequest.getRegion().getId()).orElseThrow(() ->
                new UnprocessableEntityException("Region ID not found"));

        Type primaryType = typeRepository.findById(pokemonRequest.getPrimaryType().getId()).orElseThrow(() ->
                new UnprocessableEntityException("Primary type ID not found"));

        Type secondaryType = typeRepository.findById(pokemonRequest.getSecondaryType().getId()).orElse(null);

        pokemon.setRegion(region);
        pokemon.setPrimaryType(primaryType);
        pokemon.setSecondaryType(secondaryType);
    }

}
