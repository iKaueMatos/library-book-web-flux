package com.libary.book.infra.repository;

import com.libary.book.domain.entities.Author;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends ReactiveCrudRepository<Author, Long> { }
