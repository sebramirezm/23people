package com.people.workshop.schoolservice.services;

import java.util.List;
import com.people.workshop.schoolservice.models.Course;
import org.springframework.data.domain.Pageable;

public interface CourseService {

    List<Course> findAll();
    List<Course> findByFormat(Pageable paging);
    Course findById(int id);
    void add(List<Course> courses);
    void edit(int id, Course course);
    void delete(int id);
}
