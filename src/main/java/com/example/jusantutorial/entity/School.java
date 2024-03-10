package com.example.jusantutorial.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "school")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String schoolName;
    private int numberOfStudents;
}
