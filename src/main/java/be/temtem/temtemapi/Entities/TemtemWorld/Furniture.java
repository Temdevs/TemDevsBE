package be.temtem.temtemapi.Entities.TemtemWorld;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.print.DocFlavor;

@Data
@Entity
@NoArgsConstructor
public class Furniture {
    @Id
    private Long id;
    private String classification;
    private String image_url;
    private String img_uri;
    private Number cost;
    private Number space;

    public Furniture(String classification, String image_url, String img_uri, Number cost, Number space) {
        this.classification = classification;
        this.image_url = image_url;
        this.img_uri = img_uri;
        this.cost = cost;
        this.space = space;
    }
}
