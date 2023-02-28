package com.crud.student.controller;

import com.crud.student.entity.Student;
import com.crud.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    //this controller will talk to the service class
    @Autowired
    private StudentService service;

    //now all rest points present in service
    //POST
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        //post method so @requestbody
        return  service.saveStudent(student);
    }
    //POST
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return  service.saveStudents(students);
    }
    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return  service.getStudents();
    }
    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable int id){
        //you can also use request parameter instead of PathVariable
        //else you get 404
        return service.getStudentById(id);
    }
//    @GetMapping("/student/{name}")
//    public Student findStudentByName(@PathVariable String first_name){
//        return service.getStudentByName(first_name);
//    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return  service.updateStudent(student);
    }
    @DeleteMapping("delete/{id}")
    public  String deleteProduct(@PathVariable int id){
        return service.deleteStudent(id);
    }
}
