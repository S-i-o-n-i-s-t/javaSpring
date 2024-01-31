package com.example.test_1.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Enumerated // ЗАЧЕМ ЭТА АННОТАЦИЯ, ЕСЛИ И БЕЗ НЕЕ РАБОТАЕТ
    private TaskStatus status;
    private LocalDateTime dateOfCreatoin;
}
