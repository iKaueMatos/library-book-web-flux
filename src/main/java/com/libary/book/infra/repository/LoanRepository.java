package com.libary.book.infra.repository;

import com.libary.book.domain.entities.Loan;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface LoanRepository extends ReactiveCrudRepository<Loan, Long> {
    Flux<Loan> findByUserId(Long userId);
    Flux<Loan> findByBookId(Long bookId);
}