package com.people.workshop.schoolservice.controllers;

import com.people.workshop.schoolservice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.people.workshop.schoolservice.models.Student;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
}
