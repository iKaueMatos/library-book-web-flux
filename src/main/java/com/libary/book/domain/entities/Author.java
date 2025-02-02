package com.libary.book.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "authors")
public class Author {
    @Id
    private Long authorId;
    private String name;
    private Integer birthYear;
    private String nationality;
}