package com.example.pokedex.Response;

import com.example.pokedex.Entity.Pokemon;
import com.example.pokedex.Entity.Region;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonRegionResponse {
    private long id;
    private String name;
    private List<PokemonResponse> pokemon;

    public PokemonRegionResponse(Region region){
        id = region.getId();
        name = region.getName();
        pokemon = new ArrayList<>();

        region.getPokemon().forEach(pokemon -> {
            PokemonResponse pokemonResponse = new PokemonResponse(pokemon);
            this.pokemon.add(pokemonResponse);

        });

    }
}
