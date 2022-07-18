package org.Alkemy.DisneyApp.Entities;

import lombok.Getter;
import lombok.Setter;
import org.Alkemy.DisneyApp.dto.MovieDTO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table // por alguna razon con el nombre especificado no me creaba la tabla
@Setter
@Getter

public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //id de 1 en  1
    private long id;

    private long age;
    private String name;
    private String image;
    private String history;
    private float weight;

    /**/
    @ManyToMany(mappedBy ="characters", cascade = {CascadeType.PERSIST,
    CascadeType.MERGE},
            fetch = FetchType.LAZY
    )
    private Set<MovieEntity> movies = new HashSet<>();


    public void setMovies(Set<MovieDTO> movies) {
    }
}

