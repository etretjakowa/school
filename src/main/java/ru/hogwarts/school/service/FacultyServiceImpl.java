package ru.hogwarts.school.service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.*;


@Service
public class FacultyServiceImpl implements FacultyService {

    private final Map<Long, Faculty> faculties = new HashMap<>();
    private Long facultyId = 0L;

    @Override
    public Faculty createFaculty(Faculty faculty) {
        faculty.setId(++facultyId);
        faculties.put(facultyId, faculty);
        return faculty;
    }

    @Override
    public Faculty getFaculty(Long facultyId) {
        return faculties.get(facultyId);
    }

    @Override
    public Faculty updateFaculty(Faculty faculty) {
        faculties.put(faculty.getId(), faculty);
        return faculty;
    }

    @Override
    public Faculty deleteFaculty(Long facultyId) {
        return faculties.remove(facultyId);
    }

}