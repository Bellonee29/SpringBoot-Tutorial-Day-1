package com.waytech.mycrud.service;

import com.waytech.mycrud.model.Student;

import java.util.List;

public interface StudentService {
   public Student registerStudent(Student student);

    public List<Student> getAllStudent();
     public Student getStudentById(Long id);

    public void deleteStudentRecord(Long id);

    public Student update(Long id, Student student);

    public Student getByFirstName(String studentFirstName);
}
