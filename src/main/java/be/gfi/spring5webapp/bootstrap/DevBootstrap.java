package be.gfi.spring5webapp.bootstrap;

import be.gfi.spring5webapp.model.Author;
import be.gfi.spring5webapp.model.Book;
import be.gfi.spring5webapp.model.Publisher;
import be.gfi.spring5webapp.repositories.AuthorRepository;
import be.gfi.spring5webapp.repositories.BookRepository;
import be.gfi.spring5webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        Author author = new Author("Eric", "Evans");
        Book book = new Book("Domain Driven Design", "1234");
        Publisher publisher = new Publisher("Harper Collins", "Address");

        book.setPublisher(publisher);
        author.getBooks().add(book);
        book.getAuthors().add(author);

        publisherRepository.save(publisher);
        authorRepository.save(author);
        bookRepository.save(book);

        author = new Author("Rod", "Johnson");
        book = new Book("J22E Dev", "23444");
        publisher = new Publisher("Worx", "Address 2");

        book.setPublisher(publisher);
        author.getBooks().add(book);

        publisherRepository.save(publisher);
        authorRepository.save(author);
        bookRepository.save(book);
    }
}
