package be.temtem.temtemapi.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
public class Type {

    private String name;
    private String image_uri;
}
