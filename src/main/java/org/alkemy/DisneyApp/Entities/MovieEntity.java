package org.Alkemy.DisneyApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "movie")
@Setter
@Getter

//dueño de relacion... fetch.eager
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String image;
    private String title;
    private Date date;
    private int qualification;

    @ManyToMany(
            cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    },
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "movie_character",
            joinColumns = {@JoinColumn(name = "movie_id")},
            inverseJoinColumns = {@JoinColumn(name = "character_id")})
    private Set<CharacterEntity> characters = new HashSet<>();
};



