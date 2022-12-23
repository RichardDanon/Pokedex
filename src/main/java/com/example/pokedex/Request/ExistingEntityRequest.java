package com.example.pokedex.Request;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ExistingEntityRequest {

    @NotNull
    public long id;
}