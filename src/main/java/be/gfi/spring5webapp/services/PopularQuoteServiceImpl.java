package be.gfi.spring5webapp.services;

import be.gfi.quote.PopularQuotes;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@AllArgsConstructor
@Slf4j
public class PopularQuoteServiceImpl implements JokeService {

    private final @NonNull PopularQuotes popularQuotes;

    @Override
    public String getJoke() {
        return popularQuotes.getRandomQuote();
    }
}
