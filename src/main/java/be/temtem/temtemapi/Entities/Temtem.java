package be.temtem.temtemapi.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@Entity
@NoArgsConstructor
public class Temtem {

    private @Id @GeneratedValue Long id;
    private ArrayList<Type> types;
    private String name;
    private String image_uri;
    private Temtem evolves_to;
    private Temtem evolves_from;
    private ArrayList<Technique> techniques;

    public Temtem(ArrayList<Type> types, String name, String image_uri, Temtem evolves_to,
                  Temtem evolves_from, ArrayList<Technique> techniques) {
        this.types = types;
        this.name = name;
        this.image_uri = image_uri;
        this.evolves_to = evolves_to;
        this.evolves_from = evolves_from;
        this.techniques = techniques;
    }
}
