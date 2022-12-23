package com.example.pokedex.Response;


import com.example.pokedex.Entity.Type;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeResponse {
    private long id;
    private String name;
    private String color;
    private String icon;

    public TypeResponse(Type type){
        name = type.getName();
        color = type.getColor();
        icon = type.getIcon();
        id = type.getId();
    }
}
