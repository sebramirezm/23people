package com.people.workshop.schoolservice.services;

import java.util.List;
import java.util.Optional;

import com.people.workshop.schoolservice.models.Student;

public interface StudentService {

    List <Student> findAll();
    void addStudent(List<Student> students);
    Optional <Student> findByStudentId(int id);
    void delete(int id);
}
