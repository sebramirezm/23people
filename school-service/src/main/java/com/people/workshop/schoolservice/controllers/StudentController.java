package com.people.workshop.schoolservice.controllers;

import com.people.workshop.schoolservice.models.Course;
import com.people.workshop.schoolservice.models.Student;
import com.people.workshop.schoolservice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {this.studentService = studentService;}

    @GetMapping(value="/all")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createStudent(@Valid @RequestBody List<Student> students) {
        studentService.addStudent(students);
    }
}
