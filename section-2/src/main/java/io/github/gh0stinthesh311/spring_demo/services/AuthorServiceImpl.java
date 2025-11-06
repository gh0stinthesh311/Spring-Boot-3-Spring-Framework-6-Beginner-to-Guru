package io.github.gh0stinthesh311.spring_demo.services;

import io.github.gh0stinthesh311.spring_demo.domain.Author;
import io.github.gh0stinthesh311.spring_demo.reps.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
