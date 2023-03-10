package com.example.pokedex.Response;

import com.example.pokedex.Entity.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegionResponse {
    private long id;
    private String name;

    public RegionResponse(Region region){
        id = region.getId();
        name = region.getName();
    }
}
