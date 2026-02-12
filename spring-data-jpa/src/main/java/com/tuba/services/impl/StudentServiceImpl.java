package com.tuba.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuba.dto.DtoStudent;
import com.tuba.dto.DtoStudentIU;
import com.tuba.entities.Student;
import com.tuba.repository.StudentRepository;
import com.tuba.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) { // Burada DtoStudentIU Insert ;Update için kullanılıyor
															// DtoStudent ise getter ve setter olarak kullanılıyor.
		DtoStudent response=new DtoStudent();
		Student student= new Student();
		BeanUtils.copyProperties(dtoStudentIU, student);
		
		Student dbStudent=studentRepository.save(student);
		BeanUtils.copyProperties(dbStudent, response);
		
		return response;
	}

	@Override
	public List<DtoStudent> getAllStudents() {
		List<DtoStudent> dtoList=new ArrayList<>();
		List<Student> studentList = studentRepository.findAllStudents();
		
		for(Student student : studentList) {
			
			DtoStudent dto=new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			dtoList.add(dto);
		}
		return dtoList;
		// return studentRepository.findAll();
	}

	@Override
	public DtoStudent getStudentById(Integer id) {

		DtoStudent dto=new DtoStudent();
		Optional<Student> optional = studentRepository.findStudentById(id);
		if (optional.isPresent()) {// = if(!optional.isEmpty()) //id boş değilse
			Student dbStudent=optional.get();
			BeanUtils.copyProperties(dbStudent,dto);
		}
		return dto; 
		//return null;// veriyi bulamazsa null dönecek sonra exception yazılacak

	}

	@Override
	public void deleteStudent(Integer id) {
		Optional<Student> optional=studentRepository.findById(id);
		if(optional.isPresent()) {
		studentRepository.delete(optional.get());
		}
		
	}

	@Override
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
		DtoStudent dto=new DtoStudent();
		
		Optional<Student> optional=studentRepository.findById(id);

		if(optional.isPresent())
		{
			Student dbStudent=optional.get();
			dbStudent.setFirstName(dtoStudentIU.getFirstName());
			dbStudent.setLastName(dtoStudentIU.getLastName());
			dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
			
			Student updatedStudent= studentRepository.save(dbStudent);
			
			BeanUtils.copyProperties(updatedStudent, dto);
			return dto;
			
			
		}
		return null;
	}

}
