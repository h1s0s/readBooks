package com.project.readBooks.book.domain;

import com.project.readBooks.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="book")
@Data
public class Book extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bookNo;

    @Column
    private String name;

    @OneToOne(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private BookCategory bookCategory;

    @OneToMany(mappedBy = "bookImage", cascade = CascadeType.ALL)
    private List<BookImage> bookImageList = new ArrayList<>();

    @OneToMany(mappedBy = "bookReview", cascade = CascadeType.ALL)
    private List<BookReview> bookReviewList = new ArrayList<>();
}
