package be.temtem.temtemapi.Repositories;

import be.temtem.temtemapi.Entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeRepository extends JpaRepository<Type, Long> {
}
