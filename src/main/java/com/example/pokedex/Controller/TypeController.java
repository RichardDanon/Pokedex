package com.example.pokedex.Controller;

import com.example.pokedex.Entity.Region;
import com.example.pokedex.Entity.Type;
import com.example.pokedex.Response.*;
import com.example.pokedex.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/types")
public class TypeController {

    @Autowired
    TypeService typeService;

    @GetMapping
    public List<TypeResponse> getAllTypes(){

        List<Type> types = typeService.getAllTypes();
        List<TypeResponse> typeResponses = new ArrayList<>();

        types.forEach(type -> {
            TypeResponse typeResponse = new TypeResponse(type);
            typeResponses.add(typeResponse);
        });

        return typeResponses;
    }
}
