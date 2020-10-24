package be.temtem.temtemapi.Repositories.UserInfo;

import java.util.List;

import be.temtem.temtemapi.Entities.UserInfo.Enthusiast;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EnthusiastRepository extends PagingAndSortingRepository<Enthusiast, String> {
    /**
     * Find the list of linguist users.
     *
     * @param text String that refers to the name of the linguist user.
     * @return a list of the linguist users.
     */
    List<Enthusiast> findByUsernameContaining(@Param("text") String text);

}
