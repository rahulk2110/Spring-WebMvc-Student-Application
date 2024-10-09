package com.raj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
