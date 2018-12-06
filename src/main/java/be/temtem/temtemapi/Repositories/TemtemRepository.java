package be.temtem.temtemapi.Repositories;

import be.temtem.temtemapi.Entities.Temtem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemtemRepository extends JpaRepository<Temtem, Long> {

}
