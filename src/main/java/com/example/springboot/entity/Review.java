package com.example.springboot.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cost;
    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt=new Date();
    // FK(외래키)
    @ManyToOne // 관계설정
    // JPA야(Book book은 테이블의 컬럼으로 만들지 말고
    // FK로 만들어 줘)
    @JoinColumn(name="book_id", referencedColumnName = "id", nullable = false)
    private Book book; // book_PK(id)
}
