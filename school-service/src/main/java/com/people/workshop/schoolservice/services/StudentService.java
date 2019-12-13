package com.people.workshop.schoolservice.services;

import java.util.List;
import java.util.Optional;

import com.people.workshop.schoolservice.models.Student;

public interface StudentService {

    List <Student> findAll();
    void save(Student student);
    Optional <Student> findById(int id);
    void delete(int id);
}
