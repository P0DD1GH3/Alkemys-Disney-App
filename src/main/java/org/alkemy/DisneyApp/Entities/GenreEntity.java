package org.Alkemy.DisneyApp.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "genre")
@Setter
@Getter

public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String image;
    private String movie;


}
