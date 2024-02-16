package com.waytech.mycrud.service;

import com.waytech.mycrud.model.Student;
import com.waytech.mycrud.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;
    @Override
    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentRecord(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student update(Long id, Student student) {
        Student studentDb = studentRepository.findById(id).get();
        studentDb.setStudentFirstName(student.getStudentFirstName());
        studentDb.setStudentLastName(student.getStudentLastName());
        studentDb.setPhoneNumber(student.getPhoneNumber());
        studentDb.setEmail(student.getEmail());
        studentDb.setStudentCourse(student.getStudentCourse());
        studentDb.setStudentDepartment(student.getStudentDepartment());
        return studentRepository.save(studentDb);
    }

    @Override
    public Student getByFirstName(String studentFirstName) {
        return studentRepository.findByStudentFirstName(studentFirstName);
    }


}
