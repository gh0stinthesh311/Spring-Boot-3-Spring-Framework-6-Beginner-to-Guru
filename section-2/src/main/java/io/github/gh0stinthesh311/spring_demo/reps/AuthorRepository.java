package io.github.gh0stinthesh311.spring_demo.reps;

import io.github.gh0stinthesh311.spring_demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
