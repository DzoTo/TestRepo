package com.example.jusantutorial.repository;

import com.example.jusantutorial.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SchoolRepository extends JpaRepository<School, Long> {
    School findSchoolBySchoolName(String schoolName);

    @Query("select s.numberOfStudents from School s where s.id = :id")
    int findStudentsOfSchool(Long id);
}
