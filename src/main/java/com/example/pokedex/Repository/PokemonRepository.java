package com.example.pokedex.Repository;

import com.example.pokedex.Entity.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.synth.Region;
import java.lang.reflect.Type;
import java.util.List;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon,Long> {

    public List<Pokemon> findAllByNameIgnoreCase (String name);

    public List<Pokemon> findAllByTypeIgnoreCase (Type type);

    public List<Pokemon> findAllByRegionIgnoreCase (Region region);


}
