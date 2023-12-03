package com.project.readBooks.user.domain;

import com.project.readBooks.book.domain.Book;
import com.project.readBooks.book.domain.BookReview;
import com.project.readBooks.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNo;

    @Column
    private String userId;

    @Column
    private String password;
}
