package be.temtem.temtemapi.Repositories;

import be.temtem.temtemapi.Entities.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
}
