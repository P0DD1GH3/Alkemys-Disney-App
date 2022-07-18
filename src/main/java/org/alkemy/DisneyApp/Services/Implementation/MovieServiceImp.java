package org.Alkemy.DisneyApp.Services.Implementation;
import com.sun.xml.bind.v2.TODO;
import org.Alkemy.DisneyApp.Entities.mapper.MovieMapper;
import org.Alkemy.DisneyApp.Services.MovieService;
import org.Alkemy.DisneyApp.dto.MovieDTO;
import org.springframework.stereotype.*;

@Service
public class MovieServiceImp implements MovieService {


    MovieMapper movieMapper;
    public MovieDTO save(MovieDTO dto){
        System.out.println("guardar continente");
        return dto;
        //TODO:FINALIZAR REPOSITORIO Y ESTA CLASE... VER VIDEO PARTE DOS MINUTO 6:53
    };
};
