package be.gfi.spring5webapp.config;

import be.gfi.quote.ChuckNorrisQuotes;
import be.gfi.quote.Quotes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class QuoteConfiguration {

    @Bean
    public Quotes chuckQuotes() {
        log.info("Creating chuck quotes bean");

        return new ChuckNorrisQuotes();
    }
}
