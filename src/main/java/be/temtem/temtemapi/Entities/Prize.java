package be.temtem.temtemapi.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Prize {

    private @Id @GeneratedValue Long id;
    private String name;
    private String description;
    private Boolean active;

    public Prize(String name, String description, Boolean active) {
        this.name = name;
        this.description = description;
        this.active = active;
    }
}
