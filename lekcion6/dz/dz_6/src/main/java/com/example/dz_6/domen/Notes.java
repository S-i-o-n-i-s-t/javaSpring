package com.example.dz_6.domen;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notes")
@AllArgsConstructor//Конструктор
@NoArgsConstructor//Конструктор без аргументов
public class Notes {
    //		Структура заметки:
//		- ID (автоинкрементное)(тип - Long)
//		- Заголовок (не может быть пустым)(тип - String)
//		- Содержимое (не может быть пустым)(тип - String)
//		- Дата создания (автоматически устанавливается при создании заметки)(тип - LocalDateTime)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false, length = 2000)
    private String content;
    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createDate;
}
