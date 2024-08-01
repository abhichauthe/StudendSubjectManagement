package com.techeazy.StudentSubjectManagement.repository;



import com.techeazy.StudentSubjectManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}