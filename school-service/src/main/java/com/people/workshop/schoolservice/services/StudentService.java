package com.people.workshop.schoolservice.services;

import java.util.List;
import org.springframework.data.domain.Pageable;

import com.people.workshop.schoolservice.models.Student;

public interface StudentService {

    List<Student> findAll();
    List<Student> findByFormat(Pageable paging);
    Student findById(int id);
    void add(List<Student> courses);
    void edit(int id, Student course);
    void delete(int id);
}
