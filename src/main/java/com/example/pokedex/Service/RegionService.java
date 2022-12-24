package com.example.pokedex.Service;

import com.example.pokedex.Entity.Pokemon;
import com.example.pokedex.Entity.Region;
import com.example.pokedex.Exception.ResourceNotFoundException;
import com.example.pokedex.Repository.PokemonRepository;
import com.example.pokedex.Repository.RegionRepository;
import com.example.pokedex.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RegionService {

    @Autowired
    PokemonRepository pokemonRepository;

    @Autowired
    RegionRepository regionRepository;

    public List<Region> getAllRegions(){
        return (List<Region>) regionRepository.findAll();
    }

    public Region getRegion(long id){
         Region region = regionRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Region ID not found"));

         region.setPokemon(pokemonRepository.findAllByRegion(region));

        return region;
    }

}
