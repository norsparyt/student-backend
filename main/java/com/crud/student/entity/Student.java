package com.crud.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="STUDENT_DETAILS")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private String course;
}
