package be.temtem.temtemapi.Repositories;

import be.temtem.temtemapi.Entities.Technique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechniqueRepository extends JpaRepository<Technique, Long> {
}
