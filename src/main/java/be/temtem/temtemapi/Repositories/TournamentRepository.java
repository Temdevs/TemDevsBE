package be.temtem.temtemapi.Repositories;

import be.temtem.temtemapi.Entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
}
