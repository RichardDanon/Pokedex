package com.example.pokedex.Request;

import lombok.*;

import javax.persistence.Column;

import javax.validation.constraints.*;

@Getter
@Setter
public class TypeRequest {

    @NotNull
    public long id;

    @NotBlank
    public String name;

    @NotBlank
    public String color;

    @NotBlank
    public String icon;

}
