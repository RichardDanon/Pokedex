package com.example.pokedex.Request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.*;
import javax.validation.constraints.*;

@Getter
@Setter
public class PokemonRequest {

    @NotNull
    public long id;

    @NotBlank
    public String name;

    @NotNull
    public Integer primaryType;

    public Integer secondaryType;

    //Because they will already exist
    @NotNull
    private ExistingEntityRequest region;

}
