package be.temtem.temtemapi.Repositories;

import be.temtem.temtemapi.Entities.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
}
