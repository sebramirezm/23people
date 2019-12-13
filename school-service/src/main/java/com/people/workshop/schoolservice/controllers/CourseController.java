package com.people.workshop.schoolservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.people.workshop.schoolservice.services.CourseService;
import com.people.workshop.schoolservice.models.Course;

import java.util.List;

@RestController
@RequestMapping(path="/courses")
public class CourseController {

    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {this.courseService = courseService;}

    @GetMapping(value="/all")
    public List<Course> findAll(){
        return courseService.findAll();
    }

    //@PostMapping()
}
