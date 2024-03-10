package com.example.jusantutorial;

import com.example.jusantutorial.entity.School;
import com.example.jusantutorial.entity.Student;
import com.example.jusantutorial.repository.SchoolRepository;
import com.example.jusantutorial.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class JusanTutorialApplication implements CommandLineRunner {
    private final SchoolRepository schoolRepository;
    private final StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(JusanTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        School school1 = new School(1L, "RPhMs", 500);
        School school2 = new School(2L, "NIS", 500);
        School school3 = new School(3L, "KTL", 700);
        schoolRepository.save(school1);
        schoolRepository.save(school2);
        schoolRepository.save(school3);

        Student student1 = new Student(1L, "Roma", "Roma", "ramazan@gmail.com", 23, 99);
        Student student2 = new Student(2L, "Beiba", "Bob", "bibarys@gmail.com", 27, 91);
        Student student3 = new Student(3L, "Adi", "Kek", "adi@gmail.com", 20, 100);
        Student student4 = new Student(4L, "Talgat", "Mus", "talgat@gmail.com", 20, 75);
        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);
        List<Student> studentList = studentRepository.findStudentByName("Roma");
        System.out.println("First method findStudentByName result" + studentList);

        List<Student> studentList1 = studentRepository.findStudentsByAge(20);
        System.out.println("Second method findStudentsByAge result: " + studentList1);

        School school4 = schoolRepository.findSchoolBySchoolName("KTL");
        System.out.println("First method of school repo result: " + school4);

        int numberOfStudents = schoolRepository.findStudentsOfSchool(3L);
        System.out.println("Second method of school repos result: " + numberOfStudents);
    }
}
