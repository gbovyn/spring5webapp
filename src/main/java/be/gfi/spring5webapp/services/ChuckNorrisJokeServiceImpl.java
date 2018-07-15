package be.gfi.spring5webapp.services;

import be.gfi.quote.Quotes;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChuckNorrisJokeServiceImpl implements JokeService {

    private final @NonNull Quotes quotes;

    private ChuckNorrisJokeServiceImpl(final Quotes chuckQuotes) {
        this.quotes = chuckQuotes;
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
