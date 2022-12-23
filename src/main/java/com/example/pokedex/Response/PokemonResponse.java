package com.example.pokedex.Response;

import com.example.pokedex.Entity.Pokemon;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonResponse {

    private long id;
    private String name;
    private TypeResponse primaryType;
    private TypeResponse secondaryType;
    private RegionResponse region;

    public PokemonResponse(Pokemon pokemon){
        id = pokemon.getId();
        name = pokemon.getName();
        primaryType = new TypeResponse(pokemon.getPrimaryType());
        secondaryType =  new TypeResponse(pokemon.getSecondaryType());
        region = new RegionResponse(pokemon.getRegion());
    }
}
