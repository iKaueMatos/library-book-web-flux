package com.libary.book.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("loans")
public class Loan {
    @Id
    private Long loanId;
    private Long userId;
    private Long bookId;
    private LocalDate loanDate;
    private LocalDate returnDate;
}
