package org.Alkemy.DisneyApp.Entities.mapper;

import org.Alkemy.DisneyApp.Entities.CharacterEntity;
import org.Alkemy.DisneyApp.dto.CharacterDTO;
import org.springframework.stereotype.Component;

@Component
public class CharacterMapper {
    public CharacterEntity characterDTO2Entity(CharacterDTO dto) {
        CharacterEntity characterEntity = new CharacterEntity();
        characterEntity.setAge(dto.getAge());
        characterEntity.setHistory(dto.getHistory());
        characterEntity.setImage(dto.getImage());
        characterEntity.setName(dto.getName());
        characterEntity.setWeight(dto.getWeight());
        characterEntity.setMovies(dto.getMovies());
        return characterEntity;
    }

}
