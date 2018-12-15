package be.temtem.temtemapi.Repositories.TemtemWorld;

import be.temtem.temtemapi.Entities.TemtemWorld.Temtem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TemtemRepository extends JpaRepository<Temtem, Long> {

}
