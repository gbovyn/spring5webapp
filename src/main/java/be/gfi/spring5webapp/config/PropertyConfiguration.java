package be.gfi.spring5webapp.config;

import be.gfi.properties.GfiApplicationProperties;
import be.gfi.properties.GfiProperties;
import be.gfi.properties.OtherGfiProperties;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:gfi.properties")
@PropertySources({
        @PropertySource("classpath:gfi.properties"),
        @PropertySource("classpath:other-gfi.properties")
})
public class PropertyConfiguration {

    @Autowired
    private Environment env;


    @Value("${gfi.user}")
    private String user;

    @Value("${gfi.pass}")
    private String pass;

    @Value("${gfi.site}")
    private String site;


    @Value("${gfi.username}")
    private String username;

    @Value("${gfi.password}")
    private String password;

    @Value("${gfi.website}")
    private String website;


    @Value("${gfi.login.url}")
    private String loginUrl;

    @Value("${gfi.logout.url}")
    private String logoutUrl;


    @Bean
    public GfiProperties gfiProperties() {
        val gfiProperties = new GfiProperties();

        gfiProperties.setUser(user);
        gfiProperties.setPass(pass);
        gfiProperties.setSite(site);

        return gfiProperties;
    }

    @Bean
    public OtherGfiProperties otherGfiProperties() {
        return OtherGfiProperties.builder()
                .username(username)
                .password(password)
                .website(website)
                .build();
    }

    @Bean
    public GfiApplicationProperties gfiApplicationProperties() {
        return new GfiApplicationProperties(loginUrl, logoutUrl);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
