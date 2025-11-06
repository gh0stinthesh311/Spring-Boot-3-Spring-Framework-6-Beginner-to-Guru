package io.github.gh0stinthesh311.spring_demo.reps;

import io.github.gh0stinthesh311.spring_demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
