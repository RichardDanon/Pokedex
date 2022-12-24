package com.example.pokedex.Controller;

import com.example.pokedex.Entity.Pokemon;
import com.example.pokedex.Entity.Region;
import com.example.pokedex.Response.PokemonRegionResponse;
import com.example.pokedex.Response.PokemonResponse;
import com.example.pokedex.Response.RegionResponse;
import com.example.pokedex.Service.PokemonService;
import com.example.pokedex.Service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/regions")
public class RegionController {
    @Autowired
    RegionService regionService;

    @GetMapping
    public List<RegionResponse> getAllRegions(){

        List<Region> regions = regionService.getAllRegions();
        List<RegionResponse> regionResponses = new ArrayList<>();

        regions.forEach(region -> {
            RegionResponse regionResponse = new RegionResponse(region);
            regionResponses.add(regionResponse);
        });

        return regionResponses;
    }

    @GetMapping("/{id}")
    public PokemonRegionResponse getRegion(@PathVariable long id){

        PokemonRegionResponse regionResponse = new PokemonRegionResponse(regionService.getRegion(id));

        return regionResponse;
    }
}
