package com.people.workshop.schoolservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.people.workshop.schoolservice.models.Course;
import com.people.workshop.schoolservice.repositories.CourseRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {this.courseRepository = courseRepository;}

    @Override
    public List<Course> findAll() {return courseRepository.findAll();}

    @Override
    public Optional<Course> findById(int id) {return courseRepository.findById(id);}

    @Override
    public void addCourse(List<Course> courses) {courseRepository.saveAll(courses);}

    @Override
    public String editCourse(int id, List<Course> courses) throws EntityNotFoundException {
        if (!courseRepository.findById(id).isPresent()){
            throw new EntityNotFoundException("Course not found");
        }
        courses.setId(id);
        courseRepository.saveAll(courses);
        return "updated course with id: " + id;
    }

    @Override
    public void delete(int id) {courseRepository.deleteById(id);}
}
