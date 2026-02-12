package com.tuba.controller;

import java.util.List;

import com.tuba.dto.DtoStudent;
import com.tuba.dto.DtoStudentIU;

public interface IStudentControler {

	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	public List<DtoStudent> getAllStudents();
	public DtoStudent getStudentById(Integer id);
	public void deleteStudent(Integer id);
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
 