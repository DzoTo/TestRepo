package com.example.jusantutorial.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private int grade;
}
