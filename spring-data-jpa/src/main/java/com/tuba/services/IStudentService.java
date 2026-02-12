package com.tuba.services;

import java.util.List;

import com.tuba.dto.DtoStudent;
import com.tuba.dto.DtoStudentIU;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU student);
	public List<DtoStudent> getAllStudents();
	public DtoStudent getStudentById(Integer id);
	public void deleteStudent(Integer id);
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);

}
