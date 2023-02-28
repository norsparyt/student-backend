package com.crud.student.service;

import com.crud.student.entity.Student;
import com.crud.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }
    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }
    public List<Student> getStudents(){
        return repository.findAll();
    }
    public Student getStudentById(int id){
        return repository.findById(id).orElse(null);
    }
//    public Student getStudentByName(String first_name){
//        return repository.findByName(first_name);
//    }
    public String deleteStudent(int id){
        repository.deleteById(id);
        return "product removed  !! "+id;
    }
    public  Student updateStudent(Student student){
        //id can not be modified read only
        Student existingStudent=repository.findById(student.getId()).orElse(null);
        //no update method in spring data jpa, we use save
        existingStudent.setFirst_name(student.getFirst_name());
        existingStudent.setLast_name(student.getLast_name());
        existingStudent.setAge(student.getAge());
        existingStudent.setCourse(student.getCourse());
        return repository.save(existingStudent);
    }
}
