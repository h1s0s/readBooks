package com.project.readBooks.user.domain;

import com.project.readBooks.common.domain.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserWish extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String wishNo;

    @Column
    private String userNo;

    @Column
    private String bookNo;
}
