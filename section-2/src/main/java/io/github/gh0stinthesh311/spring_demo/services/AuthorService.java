package io.github.gh0stinthesh311.spring_demo.services;

import io.github.gh0stinthesh311.spring_demo.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
