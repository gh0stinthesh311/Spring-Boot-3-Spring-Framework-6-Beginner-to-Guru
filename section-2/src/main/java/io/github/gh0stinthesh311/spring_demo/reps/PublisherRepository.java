package io.github.gh0stinthesh311.spring_demo.reps;

import io.github.gh0stinthesh311.spring_demo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
