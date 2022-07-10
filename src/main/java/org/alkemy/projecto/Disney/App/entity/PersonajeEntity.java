package org.alkemy.projecto.Disney.App.entity;

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

    /*la tabla pelicula es la dueña de la relacion
     * FetchType.EAGER es para que las peliculas se asocien al personaje de inmediato
     * con LAZY. tendriamos que hacer un "llamado" cada vez que querramos esta info, con EAGER
     * queda localizado en la memoria y con LAZY se borra cada vez que se cierra la sesion. LAZY es el tipo por defecto */
    @ManyToMany(mappedBy = "pelicula", fetch = FetchType.EAGER)
    private Set<PeliculaEntity> peliculas = new HashSet<>();

}
