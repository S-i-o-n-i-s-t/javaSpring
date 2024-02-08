package com.example.demo_books.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor//Конструктор
@NoArgsConstructor//Конструктор без аргументов
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title, autor, isbn;
    private int publicationYear;

    /**
     * Конструктор без ID
     * @param title
     * @param autor
     * @param isbn
     * @param publicationYear
     */
    public Book(String title, String autor, String isbn, int publicationYear) {
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }
}
