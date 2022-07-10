package org.alkemy.projecto.Disney.App.entity;

import lombok.Data;
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

    //relacion con personajes

    /* PERSIST propaga la operacion de persistir de una entidad padre a hij@.
    Cuando guardamos la entidad pelicula la entidad personaje tambien se guarda
    //MERGE utiliza el mismo concepto de herencia como en este caso. lo que hace es:
     carga ambas entidades y luego actualiza ambas.*/


    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            fetch = FetchType.EAGER
    )

    @JoinTable(
            name = "pelicula_personaje",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "personaje_id")
    )
    private Set<PersonajeEntity> personajes = new HashSet<>();
};
