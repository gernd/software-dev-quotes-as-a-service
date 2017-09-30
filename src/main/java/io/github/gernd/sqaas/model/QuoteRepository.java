package io.github.gernd.sqaas.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.stream.Stream;

public interface QuoteRepository extends CrudRepository<QuoteEntity, Long> {

    @Query("SELECT q from QuoteEntity q")
    Stream<QuoteEntity> streamQuotes();
}
