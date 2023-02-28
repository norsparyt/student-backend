package com.crud.student.repository;

import com.crud.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
//    Student findByName(String first_name);
}
