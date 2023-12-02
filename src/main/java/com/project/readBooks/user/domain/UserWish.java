package com.project.readBooks.user.domain;

import com.project.readBooks.common.domain.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserWish extends BaseEntity {

    @Id
    private String wishNo;
}
