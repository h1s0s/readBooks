package com.project.readBooks.common.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
public class BaseEntity {

    @Column
    private LocalDateTime createdDate;

    @Column
    private String createdBy;

    @Column
    private LocalDateTime updatedDate;

    @Column
    private String updatedBy;

    @Column
    private LocalDateTime deletedDate;

    @Column
    private String deletedBy;
}
