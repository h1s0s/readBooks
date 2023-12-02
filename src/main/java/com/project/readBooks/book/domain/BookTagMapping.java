//package com.project.readBooks.book.domain;
//
//import com.project.readBooks.common.domain.BaseEntity;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
//@Entity
//@Data
//@EqualsAndHashCode(callSuper=false)
//public class BookTagMapping extends BaseEntity {
//
//    @Id
//    private String tagMappingNo;
//
//    @ManyToOne
//    @JoinColumn(name = "bookNo")
//    private Book book;
//
//    @ManyToOne
//    @JoinColumn(name = "tagNo")
//    private BookTag bookTag;
//}
