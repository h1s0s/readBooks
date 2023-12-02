package com.project.readBooks.book.domain;

import com.project.readBooks.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BookCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String categoryNo;

    @OneToOne
    @JoinColumn(name = "bookNo")
    private Book book;

}
