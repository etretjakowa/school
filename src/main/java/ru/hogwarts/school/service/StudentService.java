package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Student;

import java.util.List;


public interface StudentService {
    Student createStudent(Student student);

    Student findStudent(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);




}