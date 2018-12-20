package be.temtem.temtemapi.Entities.TournamentElements;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class TemtemProfile {
    private @Id @GeneratedValue Long id;
    private String avatar;
    private String username;
    private String gender;
    private Temtem favTemtem;

    public TemtemProfile(String avatar, String username, String gender, Temtem favTemtem) {
        this.avatar = avatar;
        this.username = username;
        this.gender = gender;
        this.favTemtem = favTemtem;
    }
}
