package com.example.pokedex.Entity;


import com.example.pokedex.Request.TypeRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Type {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "icon", nullable = false)
    private String icon;

    public Type(TypeRequest typeRequest){
        name = typeRequest.getName();
        color = typeRequest.getColor();
        icon = typeRequest.getIcon();
    }
}
