package org.Alkemy.DisneyApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "genero")
@Setter
@Getter

public class GeneroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String nombre;
    private String imagen;
    private String pelicula;


}
