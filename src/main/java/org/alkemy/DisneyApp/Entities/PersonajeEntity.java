package org.Alkemy.DisneyApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personaje")
@Setter
@Getter

public class PersonajeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //id de 1 en  1
    private long id;

    private long edad;
    private String nombre;
    private String imagen;
    private String historia;
    private float peso;

    /**/
    @ManyToMany(mappedBy ="personajes", cascade = {CascadeType.PERSIST,
    CascadeType.MERGE},
            fetch = FetchType.LAZY
    )
    private Set<PeliculaEntity> peliculas = new HashSet<>();


}

