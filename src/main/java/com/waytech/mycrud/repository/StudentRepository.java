package com.waytech.mycrud.repository;

import com.waytech.mycrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findByStudentFirstName(String studentFirstName);
}
