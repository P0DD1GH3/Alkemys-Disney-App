package org.Alkemy.DisneyApp.Controllers;

import org.Alkemy.DisneyApp.Services.MovieService;
import org.Alkemy.DisneyApp.dto.MovieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController //establece a la clase como controlador
@RequestMapping(value = "movie") //establecemos url ej: http://localhost:8080/peliculas

public class MovieController {

    @Autowired
    public MovieService movieService;

    @PostMapping
    public ResponseEntity<MovieDTO> save (@RequestBody MovieDTO movie){

        MovieDTO savedMovie = movieService.save(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMovie);
    }
}




