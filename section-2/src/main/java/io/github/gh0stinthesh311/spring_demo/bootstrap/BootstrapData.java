package io.github.gh0stinthesh311.spring_demo.bootstrap;

import io.github.gh0stinthesh311.spring_demo.domain.Author;
import io.github.gh0stinthesh311.spring_demo.domain.Book;
import io.github.gh0stinthesh311.spring_demo.domain.Publisher;
import io.github.gh0stinthesh311.spring_demo.reps.AuthorRepository;
import io.github.gh0stinthesh311.spring_demo.reps.BookRepository;
import io.github.gh0stinthesh311.spring_demo.reps.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Author 1 creation
        Author author_1 = new Author();
        author_1.setFirstName("Eric");
        author_1.setLastName("Lores");
        // Book 1 creation
        Book book_1 = new Book();
        book_1.setTitle("Domain design");
        book_1.setIsbn("123");
        // Saved auth1 and book1
        Author author_1_saved = authorRepository.save(author_1);
        Book book_1_saved = bookRepository.save(book_1);

        // Author 2 creation
        Author author_2 = new Author();
        author_2.setFirstName("Martin");
        author_2.setLastName("Fowler");
        // Book 2 creation
        Book book_2 = new Book();
        book_2.setTitle("Refactoring: Improving the Design of Existing Code");
        book_2.setIsbn("456");
        // Saved auth2 and book2
        Author author_2_saved = authorRepository.save(author_2);
        Book book_2_saved = bookRepository.save(book_2);

        // Establish relationships, namely first is adding book to author, and then we add book to author
        author_1_saved.getBooks().add(book_1_saved);
        author_2_saved.getBooks().add(book_2_saved);
        book_1_saved.getAuthors().add(author_1_saved);
        book_2_saved.getAuthors().add(author_2_saved);

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Barnes & Noble Books");
        publisher.setAddress("33 East 17th Street, New York, NY 10003");
        Publisher savedPublisher = publisherRepository.save(publisher);

        book_1_saved.setPublisher(savedPublisher);
        book_2_saved.setPublisher(savedPublisher);

        // 🔥 Explicitly Save Authors Again to Update the Join Table 🔥
        authorRepository.save(author_1_saved);
        authorRepository.save(author_2_saved);
        // Save books again (optional, since the owner side is Author)
        bookRepository.save(book_1_saved);
        bookRepository.save(book_2_saved);

        System.out.println("Book count:" + bookRepository.count());
        System.out.println("Author count:" + authorRepository.count());
        // This causes infinite cycle
        // System.out.println("Authors books count:" + author_1_saved.getBooks());
        System.out.println("Publisher count:" + publisherRepository.count());
    }
}
