package be.temtem.temtemapi.Entities.TemtemWorld;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
public class Technique {

    private @Id @GeneratedValue Long id;

    @ManyToOne
    private Type type;
    private String name;
    //physical move, status move ... (don't know if there are more)
    private String category;
    private String damage;
    private Number stamina;
    private Number hold;
    private Number priority;
    private String description;
    private String synergy;
    private String synergy_effect;

    public Technique(Type type, String name, String category, String damage,
                     Number stamina, Number hold, Number priority, String description,
                     String synergy, String synergy_effect) {

        this.type = type;
        this.name = name;
        this.category = category;
        this.damage = damage;
        this.stamina = stamina;
        this.hold = hold;
        this.priority = priority;
        this.description = description;
        this.synergy = synergy;
        this.synergy_effect = synergy_effect;

    }
}
