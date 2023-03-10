package com.example.pokedex.Request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class RegionRequest {

    @NotNull
    public long id;

    @NotBlank
    public String name;

}
