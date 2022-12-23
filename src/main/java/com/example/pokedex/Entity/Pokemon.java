package com.example.pokedex.Entity;


import com.example.pokedex.Request.PokemonRequest;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="pokemons")
@Getter
@Setter
@NoArgsConstructor
public class Pokemon {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "primary_type_id")
    private Type primaryType;

    @OneToOne
    @JoinColumn(name = "secondary_type_id")
    private Type secondaryType;


    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;


    public Pokemon (PokemonRequest pokemonRequest){


    }

}
