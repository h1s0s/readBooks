package com.project.readBooks.book.domain;

import com.project.readBooks.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="book")
@NoArgsConstructor
@Getter
@Setter
public class Book extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookNo;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "categoryNo")
    private BookCategory bookCategory;

    @OneToMany(mappedBy = "imageNo", cascade = CascadeType.ALL)
    private List<BookImage> bookImageList = new ArrayList<>();

    @OneToMany(mappedBy = "reviewNo", cascade = CascadeType.ALL)
    private List<BookReview> bookReviewList = new ArrayList<>();

//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinTable(
//            name = "book_tag_mapping",
//            joinColumns = @JoinColumn(name = "bookNo"),
//            inverseJoinColumns = @JoinColumn(name = "tagNo")
//    )
//    private Set<BookTag> tags = new HashSet<>();
}
