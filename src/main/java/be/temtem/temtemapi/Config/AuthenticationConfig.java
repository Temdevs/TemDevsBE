package be.temtem.temtemapi.Config;

import be.temtem.temtemapi.Entities.UserInfo.Admin;
import be.temtem.temtemapi.Entities.UserInfo.Enthusiast;
import be.temtem.temtemapi.Entities.UserInfo.User;
import be.temtem.temtemapi.Repositories.UserInfo.AdminRepository;
import be.temtem.temtemapi.Repositories.UserInfo.EnthusiastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class AuthenticationConfig extends GlobalAuthenticationConfigurerAdapter {
    @Autowired Environment environment;
    @Autowired UserBasicsService basicUserDetailsService;
    @Autowired AdminRepository adminRepository;
    @Autowired EnthusiastRepository enthusiastRepository;

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(basicUserDetailsService)
                .passwordEncoder(User.passwordEncoder);

        // Use encrypted secret password when deploying publicly in Heroku
        if(environment.acceptsProfiles("heroku")) {
            if (!adminRepository.existsById("admin")) {
                Admin admin = new Admin();
                admin.setEmail("admin@textannot.org");
                admin.setUsername("admin");
                admin.setPassword("$2a$10$B1dcscvS/lgiBnGdkhhupew8AhbjqUL7TjdA2ggvxQhs5jN7KVSMC");
                adminRepository.save(admin);
            }
            if (!enthusiastRepository.existsById("user")) {
                Enthusiast user = new Enthusiast();
                user.setEmail("user@textannot.org");
                user.setUsername("user");
                user.setPassword("$2a$10$B1dcscvS/lgiBnGdkhhupew8AhbjqUL7TjdA2ggvxQhs5jN7KVSMC");
                enthusiastRepository.save(user);
            }
        }
        else {
            if (!adminRepository.existsById("admin")) {
                Admin admin = new Admin();
                admin.setEmail("admin@textannot.org");
                admin.setUsername("admin");
                admin.setPassword("password");
                admin.encodePassword();
                adminRepository.save(admin);
            }
            if (!enthusiastRepository.existsById("user")) {
                Enthusiast user = new Enthusiast();
                user.setEmail("user@textannot.org");
                user.setUsername("user");
                user.setPassword("password");
                user.encodePassword();
                enthusiastRepository.save(user);
            }
        }
    }
}
