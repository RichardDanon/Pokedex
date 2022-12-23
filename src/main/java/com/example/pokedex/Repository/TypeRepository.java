package com.example.pokedex.Repository;

import com.example.pokedex.Entity.Pokemon;
import com.example.pokedex.Entity.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository extends CrudRepository<Type,Long> {
    public List<Type> findAllByNameIgnoreCase (String name);

    public List<Type> findAllByColorIgnoreCase (String color);

    public List<Type> findAllByIconIgnoreCase (String icon);

}
