package be.gfi.spring5webapp.controllers;

import be.gfi.spring5webapp.repositories.BookRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class BookController {

    private final @NonNull BookRepository bookRepository;

    @RequestMapping("/books")
    public String getBooks(final Model model) {
        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
