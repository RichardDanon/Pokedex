package com.example.pokedex.Controller;

import com.example.pokedex.Service.RegionService;
import com.example.pokedex.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/types")
public class TypeController {

    @Autowired
    TypeService typeService;
}
