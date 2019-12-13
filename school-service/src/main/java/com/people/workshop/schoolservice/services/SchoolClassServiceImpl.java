package com.people.workshop.schoolservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.people.workshop.schoolservice.models.SchoolClass;
import com.people.workshop.schoolservice.repositories.SchoolClassRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolClassServiceImpl implements SchoolClassService{

    @Autowired
    private SchoolClassRepository schoolClassRepository;

    @Override
    public Optional<SchoolClass> findById(int id) {
        return schoolClassRepository.findById(id);
    }

    @Override
    public void save(SchoolClass schoolClass) {
        schoolClassRepository.save(schoolClass);
    }

    @Override
    public List<SchoolClass> findAll() {
        return schoolClassRepository.findAll();
    }

    @Override
    public void delete(int id) {
        schoolClassRepository.deleteById(id);
    }
}
