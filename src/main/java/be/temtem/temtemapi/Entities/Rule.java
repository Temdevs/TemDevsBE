package be.temtem.temtemapi.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class Rule {
    private @Id @GeneratedValue Long id;
    private String description;
    private Boolean active;

    public Rule(String description, Boolean active) {
        this.description = description;
        this.active = active;
    }
}
