package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

import java.util.Set;

public interface StudentService {
    Student createStudent(Student student);

    Student findStudent(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);

    Set<Student> findByAge(int age);

    Set<Student> findByAgeBetween(int minAge, int maxAge);

}