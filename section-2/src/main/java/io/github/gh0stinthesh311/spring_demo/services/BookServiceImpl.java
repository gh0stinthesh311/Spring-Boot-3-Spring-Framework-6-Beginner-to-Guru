package io.github.gh0stinthesh311.spring_demo.services;

import io.github.gh0stinthesh311.spring_demo.domain.Book;
import io.github.gh0stinthesh311.spring_demo.reps.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
