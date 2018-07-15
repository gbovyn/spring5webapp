package be.gfi.quote;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
public class ChuckNorrisQuotes extends Quotes {

    private static final List<String> QUOTES = Arrays.asList(
            "Chuck Norris counted to infinity. Twice.",
            "Chuck Norris can kill two stones with one bird.",
            "Chuck Norris beat the sun in a staring contest."
    );

    @PostConstruct
    public void fillQuotes() {
        log.info("Filling in {} Chuck Norris quotes", QUOTES.size());

        fillQuotes(QUOTES);
    }
}
