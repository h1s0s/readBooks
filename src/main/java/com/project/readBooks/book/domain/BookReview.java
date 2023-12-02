package com.project.readBooks.book.domain;

import com.project.readBooks.common.domain.BaseEntity;
import com.project.readBooks.user.domain.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class BookReview extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewNo;

    @Column
    private String contents;

    @Column
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "bookNo")
    private Book book;
}
