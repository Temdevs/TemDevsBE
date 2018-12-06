package be.temtem.temtemapi.Repositories;

import be.temtem.temtemapi.Entities.Temtem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TemtemRepository extends JpaRepository<Temtem, Long> {

}
