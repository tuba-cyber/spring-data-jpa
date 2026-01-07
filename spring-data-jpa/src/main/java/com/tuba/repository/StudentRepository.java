package com.tuba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuba.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}
