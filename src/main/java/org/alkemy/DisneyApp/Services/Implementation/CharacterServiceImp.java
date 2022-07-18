package org.Alkemy.DisneyApp.Services.Implementation;

import org.Alkemy.DisneyApp.Entities.mapper.CharacterMapper;
import org.Alkemy.DisneyApp.Services.CharacterService;
import org.Alkemy.DisneyApp.dto.CharacterDTO;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImp implements CharacterService {

    CharacterMapper characterMapper;


    public CharacterDTO save(CharacterDTO dto) {
        return dto;
    }

}
