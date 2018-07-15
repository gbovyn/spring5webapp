package be.gfi.quote;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Quotes {

    private final List<String> quotes = new ArrayList<>();

    void fillQuotes(final List<String> quotes) {
        this.quotes.addAll(quotes);
    }

    public List<String> getQuotes() {
        return new ArrayList<>(quotes);
    }

    public String getRandomQuote() {
        return quotes.get(getRandomIndex());
    }

    private int getRandomIndex() {
        return ThreadLocalRandom.current().nextInt(quotes.size());
    }
}
