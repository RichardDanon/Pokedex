package com.example.pokedex.Service;

import com.example.pokedex.Entity.*;
import com.example.pokedex.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TypeService {

    @Autowired
    TypeRepository typeRepository;

    public List<Type> getAllTypes(){
        return (List<Type>) typeRepository.findAll();
    }
}
