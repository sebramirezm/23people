package com.people.workshop.schoolservice.services;

import java.util.List;
import java.util.Optional;

import com.people.workshop.schoolservice.models.Course;

public interface CourseService {

    List<Course> findAll();
    Optional<Course> findById(int id);
    void addCourse(List<Course> courses);
    String editCourse(int id, List<Course> courses);
    void delete(int id);
}
