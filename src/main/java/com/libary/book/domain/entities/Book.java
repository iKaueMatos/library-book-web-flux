package com.libary.book.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("books")
public class Book {
    @Id
    private Long bookId;
    private String title;
    private Integer publicationYear;
    private String genre;
    private Long authorId;
}