package com.project.readBooks.book.domain;

import com.project.readBooks.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BookImage extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String imageNo;

    @Column
    private String path;

    @Column
    private int order;

    @ManyToOne
    @JoinColumn(name = "bookNo")
    private Book book;
}
