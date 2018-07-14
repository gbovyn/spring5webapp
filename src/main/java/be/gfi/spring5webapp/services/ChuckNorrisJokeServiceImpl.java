package be.gfi.spring5webapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Slf4j
public class ChuckNorrisJokeServiceImpl implements JokeService {

    private static final List<String> QUOTES = Arrays.asList(
            "Chuck Norris counted to infinity. Twice.",
            "Chuck Norris can kill two stones with one bird.",
            "Chuck Norris beat the sun in a staring contest."
    );

    @Override
    public String getJoke() {
        return QUOTES.get(getRandomIndex());
    }

    private static int getRandomIndex() {
        return ThreadLocalRandom.current().nextInt(QUOTES.size());
    }
}
