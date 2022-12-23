package com.example.pokedex.Entity;


import com.example.pokedex.Request.RegionRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.List;

@Entity
@Table(name="regions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Region {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany
    private List<Pokemon> pokemon;

    public Region(RegionRequest regionRequest){
        name = regionRequest.getName();
    }

}
