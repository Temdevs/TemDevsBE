package be.temtem.temtemapi.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

    @Configuration
    public class RepositoryRestConfig extends RepositoryRestConfigurerAdapter {
        @Autowired
        Environment environment;

        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
            //expose ids
        }
}
