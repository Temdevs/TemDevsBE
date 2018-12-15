package be.temtem.temtemapi.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Entity
@NoArgsConstructor
public class Temtem {

    private @Id @GeneratedValue Long id;
    private ArrayList<Type> types;
    private String name;
    private String image_uri;

    @OneToOne
    private Temtem evolves_to;

    @OneToOne
    private Temtem evolves_from;

    public Temtem(ArrayList<Type> types, String name, String image_uri, Temtem evolves_to, Temtem evolves_from) {
        this.types = types;
        this.name = name;
        this.image_uri = image_uri;
        this.evolves_to = evolves_to;
        this.evolves_from = evolves_from;
    }
}
