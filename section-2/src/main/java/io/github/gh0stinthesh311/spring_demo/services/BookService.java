package io.github.gh0stinthesh311.spring_demo.services;

import io.github.gh0stinthesh311.spring_demo.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
