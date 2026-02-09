package com.tuba.controller;

import java.util.List;

import com.tuba.entities.Student;

public interface IStudentControler {

	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(Integer id);
	public void deleteStudent(Integer id);
	public Student updateStudent(Integer id,Student updateStudent);
}
 