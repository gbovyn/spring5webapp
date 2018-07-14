package be.gfi.spring5webapp.controllers;

import be.gfi.spring5webapp.services.JokeService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@Slf4j
public class JokeController {

    private final @NonNull JokeService jokeService;

    @RequestMapping("/")
    public String getJoke(final Model model) {
        log.info("Joke request received");

        final String randomJoke = jokeService.getJoke();

        model.addAttribute("joke", randomJoke);

        log.info("Joke sent to frontend: {}", model.asMap().get("joke"));

        return "joke";
    }
}
