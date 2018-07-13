package be.gfi.spring5webapp.controllers;

import be.gfi.spring5webapp.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @RequestMapping("/authors")
    public String getAuthors(final Model model) {
        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
