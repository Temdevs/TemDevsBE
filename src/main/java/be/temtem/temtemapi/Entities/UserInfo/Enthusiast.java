package be.temtem.temtemapi.Entities.UserInfo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Collection;

@Entity
public class Enthusiast extends User{
    @Override
    @Transient
    /**
     * This function returns collection of admin credentials.
     * Returns the collection of granted authority for the user.
     */
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ENTHUSIAST");
    }

}
