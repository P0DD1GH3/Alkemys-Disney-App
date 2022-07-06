package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity                         //define clase como entidad. la cual se mapea a una tabla.
@Table(name = "genero")         /* por default JPA le daría el mismo nombre que a la clase.
                                en este caso se lo modificamos*/

@Setter
@Getter


public class PersonajeEntity {

    @Id
    @Column
    private long id;
    private String nombre;
    private String imagen;
    private String peliculas;

}
