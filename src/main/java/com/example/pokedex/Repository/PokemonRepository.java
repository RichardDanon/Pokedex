package com.example.pokedex.Repository;

import com.example.pokedex.Entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon,Long> {

    public List<Pokemon> findAllByNameIgnoreCase (String name);

    public List<Pokemon> findAllByPrimaryTypeOrSecondaryType (Integer id, Integer secondaryId);

    public List<Pokemon> findAllByRegion (Region region);


}
