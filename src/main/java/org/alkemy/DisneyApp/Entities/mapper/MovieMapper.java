package org.Alkemy.DisneyApp.Entities.mapper;


import org.Alkemy.DisneyApp.Entities.MovieEntity;
import org.Alkemy.DisneyApp.dto.MovieDTO;
import org.springframework.stereotype.*;

@Component //este es un nombre generico el cual nos habilita injectarlo a la clase
public class MovieMapper {
    //metodo el cual le llega DTO y nos devuelve una entidad


    public MovieEntity movieDTO2Entity(MovieDTO dto){

            MovieEntity movieEntity = new MovieEntity();
            movieEntity.setImage(dto.getImage());
            movieEntity.setTitle(dto.getTitle());
            movieEntity.setQualification(dto.getQualification());

            return movieEntity;

    }
}
