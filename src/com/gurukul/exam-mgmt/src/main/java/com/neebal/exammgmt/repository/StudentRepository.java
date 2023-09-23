package com.neebal.exammgmt.repository;

import com.neebal.exammgmt.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
