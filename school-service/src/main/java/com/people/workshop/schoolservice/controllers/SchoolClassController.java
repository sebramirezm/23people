package com.people.workshop.schoolservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.people.workshop.schoolservice.services.SchoolClassService;
import com.people.workshop.schoolservice.models.SchoolClass;

import java.util.List;

@RestController
@RequestMapping(path="/courses")
public class SchoolClassController {

    @Autowired
    private SchoolClassService schoolClassService;

    @RequestMapping(value="/all", method = RequestMethod.GET)
    public List<SchoolClass> findAll(){
        return schoolClassService.findAll();
    }
}
