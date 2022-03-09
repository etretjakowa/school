package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;



public interface FacultyService {

    Faculty createFaculty(Faculty faculty);

    Faculty getFaculty(Long facultyId);

    Faculty updateFaculty(Faculty faculty);

    Faculty deleteFaculty(Long facultyId);


}