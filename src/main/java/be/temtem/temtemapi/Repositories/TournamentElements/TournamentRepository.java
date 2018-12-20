package be.temtem.temtemapi.Repositories.TournamentElements;

import be.temtem.temtemapi.Entities.TournamentElements.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
}
