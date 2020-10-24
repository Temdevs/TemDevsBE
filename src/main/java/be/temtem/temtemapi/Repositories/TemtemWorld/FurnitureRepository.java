package be.temtem.temtemapi.Repositories.TemtemWorld;

import be.temtem.temtemapi.Entities.TemtemWorld.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
}
