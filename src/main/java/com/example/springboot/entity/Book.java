package com.example.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String title;
    private int price;
    private String author;
    private int page;
    // @OneToMany : LAZY 기본(지연로딩)
    // mappedBy : 연관관계의 주인이 내가 아니다.
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Review> reviews; // null
}
