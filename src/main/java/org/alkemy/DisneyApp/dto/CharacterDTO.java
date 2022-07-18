package org.Alkemy.DisneyApp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class CharacterDTO {

    private long id;

    private long age;
    private String name;
    private String image;
    private String history;
    private float weight;
    private Set<MovieDTO> movies;
}
