package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;

import java.util.Set;


public interface FacultyService {

    Faculty createFaculty(Faculty faculty);

    Faculty findFaculty(Long id);

    Faculty editFaculty(Faculty faculty);

    void deleteFaculty(Long id);

    Set<Faculty> findByColor(String color);


    Set<Faculty> findByColorOrNameIgnoreCase(String color, String name);


}