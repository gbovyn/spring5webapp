package be.gfi.quote;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class PopularQuotes extends Quotes {

    private static final List<String> QUOTES = Arrays.asList(
            "Don't cry because it's over, smile because it happened.",
            "Be yourself; everyone else is already taken.",
            "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world."
    );

    @PostConstruct
    public void fillQuotes() {
        log.info("Filling in {} popular quotes", QUOTES.size());

        fillQuotes(QUOTES);
    }
}
