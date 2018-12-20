package be.temtem.temtemapi.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Data
@Entity
@NoArgsConstructor
public class Team {
    private @Id @GeneratedValue Long id;
    private String description;
    private TemtemProfile owner;
    private String image_uri;
    private @DateTimeFormat String date;

    @ManyToOne
    private ArrayList<Participant> players;

    @ManyToOne
    private ArrayList<TemtemProfile> staff;

    public Team(String description, TemtemProfile owner, String image_uri, String date,
                ArrayList<Participant> players, ArrayList<TemtemProfile> staff) {

        this.description = description;
        this.owner = owner;
        this.image_uri = image_uri;
        this.date = date;
        this.players = players;
        this.staff = staff;
    }
}
