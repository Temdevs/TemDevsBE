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
public class Tournament {
    private @Id @GeneratedValue Long id;
    private String description;
    private String owner;
    private String image_uri;
    private @DateTimeFormat String date;

    @ManyToOne
    private ArrayList<Team> teams;

    @ManyToOne
    private ArrayList<Prize> prize;

    @ManyToOne
    private ArrayList<Rule> rules;

    public Tournament(String description, String owner, String image_uri, String date,
                      ArrayList<Team> teams, ArrayList<Prize> prize, ArrayList<Rule> rules) {

        this.description = description;
        this.owner = owner;
        this.image_uri = image_uri;
        this.date = date;
        this.teams = teams;
        this.prize = prize;
        this.rules = rules;
    }
}
