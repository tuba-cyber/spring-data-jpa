package com.tuba.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tuba.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	//HQL:sınıfın ismi ve sınıf içindeki değişken isimleri kullanılarak yazılan sorgulardır.
	//SQL: tablo ismi ve tablo içindeki kolon isimleri kullanılarak yazılan sorgulardır.
//	@Query(value = "from Student", nativeQuery = false) //nativeQuery = false olunca HQL olarak yazılır
//	List<Student> findAllStudents();
	
	@Query(value = "select * from student.student", nativeQuery = true) //nativeQuery = true olunca SQL olarak yazılır ve tablo şemaları da yazılarak eklenir.
	List<Student> findAllStudents();
	
	@Query(value = "from Student s WHERE s.id=:studentId", nativeQuery=false)
	Optional<Student> findStudentById(Integer studentId);
	
	

}
