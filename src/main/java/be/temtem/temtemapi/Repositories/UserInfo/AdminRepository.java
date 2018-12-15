package be.temtem.temtemapi.Repositories.UserInfo;

import be.temtem.temtemapi.Entities.UserInfo.Admin;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AdminRepository extends PagingAndSortingRepository<Admin, String> {

    /**
     * Find the list of admin users.
     * @param text String that refers to the name of the admin user.
     * @return a list of the admin users.
     */
    List<Admin> findByUsernameContaining(@Param("text") String text);
}