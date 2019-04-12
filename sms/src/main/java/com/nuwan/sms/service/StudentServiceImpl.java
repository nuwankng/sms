package com.nuwan.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuwan.sms.modal.Student;
import com.nuwan.sms.modal.Telephone;
import com.nuwan.sms.repository.StudentRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	
	
	@Override
	public Student save(Student student){
		for(Telephone telephone:student.getTelephones()){
			telephone.setStudent(student);
		}
		return studentRepository.save(student);
		
	}
	
	@Override
	public List<Student> fetch(){
		
		return studentRepository.findAll();
	}
	
	@Override
	public Student fetch(Integer id){
		Optional<Student> student = studentRepository.findById(id);
		if (student.isPresent()){
			return student.get();
		} else{
			return null;
		}
				
	}


	
	

	
	
}
