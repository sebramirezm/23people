package com.people.workshop.schoolservice.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.people.workshop.schoolservice.models.Course;

public interface CourseService {

    List<Course> findAll();
    void addCourse(ArrayList<Course> courses);
    Optional<Course> findById(int id);
    void delete(int id);
}
