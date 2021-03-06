package org.Alkemy.DisneyApp.Controllers;

import org.Alkemy.DisneyApp.Services.CharacterService;
import org.Alkemy.DisneyApp.dto.CharacterDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")

public class CharacterController {

    @Autowired
    CharacterService characterService;

    @PostMapping
    public ResponseEntity<CharacterDTO> save (@RequestBody CharacterDTO character){
        CharacterDTO savedCharacter = characterService.save(character);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCharacter);
    }

}
