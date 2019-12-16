package com.people.workshop.schoolservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.people.workshop.schoolservice.models.Student;
import com.people.workshop.schoolservice.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {this.studentRepository = studentRepository;}

    @Override
    public Optional<Student> findByStudentId(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void addStudent(List<Student> students) {
        studentRepository.saveAll(students);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }

}
