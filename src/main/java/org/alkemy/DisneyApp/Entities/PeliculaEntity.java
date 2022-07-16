package org.Alkemy.DisneyApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pelicula")
@Setter
@Getter

//dueño de relacion... fetch.eager
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String imagen;
    private String titulo;
    private Date fecha;
    private int calificacion;

    @ManyToMany(
            cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    },
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "pelicula_personaje",
            joinColumns = {@JoinColumn(name = "pelicula_id")},
            inverseJoinColumns = {@JoinColumn(name = "personaje_id")})
    private Set<PersonajeEntity> personajes = new HashSet<>();
};



