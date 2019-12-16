package com.people.workshop.schoolservice.controllers;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import com.people.workshop.schoolservice.services.CourseService;
import com.people.workshop.schoolservice.models.Course;

@Validated
@RestController
@RequestMapping(path="/courses")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {this.courseService = courseService;}

    @GetMapping(value="/all")
    public List<Course> findAll(){return courseService.findAll();}

    @GetMapping
    public List<Course> getAllCourses(Pageable paging) {
        return courseService.orderedCourses(paging);
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable @Min(1) int id){
        return courseService.findById(id);}

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createCourse(@Valid @RequestBody List<Course> course){courseService.add(course);}

    @PutMapping("/{id}")
    public String updateCourse(@Valid @PathVariable int id, @RequestBody Course course){
        return courseService.edit(id, course);}

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id){courseService.delete(id);
    }
}
