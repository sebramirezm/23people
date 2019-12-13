package com.people.workshop.schoolservice.controllers;

import com.people.workshop.schoolservice.models.Student;
import com.people.workshop.schoolservice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value="/all", method = RequestMethod.GET)//acotar a getMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }

}
