package be.temtem.temtemapi.Repositories.TemtemWorld;

import be.temtem.temtemapi.Entities.TemtemWorld.Technique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TechniqueRepository extends JpaRepository<Technique, Long> {
}
