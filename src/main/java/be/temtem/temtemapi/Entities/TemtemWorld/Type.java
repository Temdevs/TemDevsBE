package be.temtem.temtemapi.Entities.TemtemWorld;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Type {

    @Id
    private Long id;
    private String name;
    private String image_uri;
}
