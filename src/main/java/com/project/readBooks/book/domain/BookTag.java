package com.project.readBooks.book.domain;

import com.project.readBooks.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class BookTag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tagNo;

    @ManyToMany(mappedBy = "tagNo")
    private Set<Book> bookList = new HashSet<>();
}
