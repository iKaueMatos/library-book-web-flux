package com.libary.book.infra.repository;

import com.libary.book.domain.entities.Book;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, Long> {
    Flux<Book> findByAuthorId(Long authorId);
}
