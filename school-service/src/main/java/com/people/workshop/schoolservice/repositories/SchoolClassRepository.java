package com.people.workshop.schoolservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.people.workshop.schoolservice.models.SchoolClass;

@Repository
public interface SchoolClassRepository extends JpaRepository<SchoolClass, Integer>{
}
