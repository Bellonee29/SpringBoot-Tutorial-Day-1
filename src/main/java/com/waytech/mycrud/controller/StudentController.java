package com.waytech.mycrud.controller;

import com.waytech.mycrud.model.Student;
import com.waytech.mycrud.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private  StudentService studentService;
    @PostMapping("/register")
    public Student registerStudent (@RequestBody Student student){
        return studentService.registerStudent(student);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent (){
        return studentService.getAllStudent();
    }

    @GetMapping("getStudentById/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteStudentRecord(@PathVariable("id") Long id){
        studentService.deleteStudentRecord(id);
        return "Student Record Delete Successfully";
    }

    @PutMapping("/update/{id}")
    public Student update(@PathVariable("id") Long id, @RequestBody Student student){
        return studentService.update(id,student);
    }

    @GetMapping("/GetByFirstName/{firstName}")
    public Student getByFirstName(@PathVariable("firstName") String studentFirstName){
        return studentService.getByFirstName(studentFirstName);
    }


}
