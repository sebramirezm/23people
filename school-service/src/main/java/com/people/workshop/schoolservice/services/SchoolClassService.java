package com.people.workshop.schoolservice.services;

import java.util.List;
import java.util.Optional;

import com.people.workshop.schoolservice.models.SchoolClass;

public interface SchoolClassService {
    List<SchoolClass> findAll();
    void save(SchoolClass schoolClass);
    Optional<SchoolClass> findById(int id);
    void delete(int id);
}
