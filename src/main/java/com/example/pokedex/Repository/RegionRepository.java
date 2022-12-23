package com.example.pokedex.Repository;

import com.example.pokedex.Entity.Region;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends CrudRepository<Region,Long> {

    public List<Region> findAllByNameIgnoreCase (String name);

}
