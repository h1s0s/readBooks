package com.project.readBooks.book.domain;

import com.project.readBooks.common.domain.BaseEntity;
import com.project.readBooks.user.domain.User;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BookReview extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String reviewNo;

    @Column
    private String contents;

    @Column
    private Integer score;

    @OneToOne(mappedBy = "userNo", cascade = CascadeType.ALL)
    private User user;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;
}
