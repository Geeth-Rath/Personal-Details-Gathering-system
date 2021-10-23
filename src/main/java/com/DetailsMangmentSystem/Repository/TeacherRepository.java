package com.DetailsMangmentSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DetailsMangmentSystem.Entity.Student;
import com.DetailsMangmentSystem.Entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
