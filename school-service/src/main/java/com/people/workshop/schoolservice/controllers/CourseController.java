package com.people.workshop.schoolservice.controllers;

import javax.validation.Valid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.people.workshop.schoolservice.services.CourseService;
import com.people.workshop.schoolservice.models.Course;

@RestController
@RequestMapping(path="/courses")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {this.courseService = courseService;}

    @GetMapping(value="/all")
    public List<Course> findAll(){return courseService.findAll();}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createCourse(@Valid @RequestBody List<Course> course){courseService.addCourse(course);}

    @PutMapping("/{id}")
    public String updateCourse(@Valid @PathVariable int id, @RequestBody List<Course> course){
        return courseService.editCourse(id, course);
    }
}
