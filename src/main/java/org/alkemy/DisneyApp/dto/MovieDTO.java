/* dto Data Transfer Object
utilizamos esta clase/objeto como intermediario de informacion
los atributos del objeto instanciado
*/
package org.Alkemy.DisneyApp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
public class MovieDTO {

    private long id;
    private String image;
    private String title;
    private Date date;
    private int qualification;
    private Set<CharacterDTO> characters;
    private Set<GenreDTO> genres;
}
