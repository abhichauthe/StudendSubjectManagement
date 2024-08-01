package com.techeazy.StudentSubjectManagement.repository;



import com.techeazy.StudentSubjectManagement.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}