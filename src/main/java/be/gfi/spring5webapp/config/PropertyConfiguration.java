package be.gfi.spring5webapp.config;

import be.gfi.properties.GfiProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:gfi.properties")
public class PropertyConfiguration {

    @Value("${gfi.user}")
    private String user;
    @Value("${gfi.pass}")
    private String pass;
    @Value("${gfi.site}")
    private String site;

    @Bean
    public GfiProperties gfiProperties() {
        GfiProperties gfiProperties = new GfiProperties();

        gfiProperties.setUser(user);
        gfiProperties.setPass(pass);
        gfiProperties.setSite(site);

        return gfiProperties;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
