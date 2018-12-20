package be.temtem.temtemapi.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Data
@Entity
@NoArgsConstructor
public class Participant {
    private @Id @GeneratedValue Long id;
    private Number position;
    private TemtemProfile user;
    private ArrayList<Temtem> temtemsTeam;

    public Participant(Number position, TemtemProfile user, ArrayList<Temtem> temtemsTeam) {
        this.position = position;
        this.user = user;
        this.temtemsTeam = temtemsTeam;
    }
}
