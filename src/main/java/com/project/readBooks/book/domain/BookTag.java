//package com.project.readBooks.book.domain;
//
//import com.project.readBooks.common.domain.BaseEntity;
//import jakarta.persistence.*;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//@Data
//@EqualsAndHashCode(callSuper=false)
//public class BookTag extends BaseEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String tagNo;
//
//    @ManyToMany(mappedBy = "bookNo")
//    private Set<Book> bookList = new HashSet<>();
//}
