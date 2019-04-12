package com.nuwan.sms.service;

import java.util.List;

import com.nuwan.sms.modal.Student;

public interface StudentService{
	
	Student save(Student student);
	List<Student> fetch();
	Student fetch(Student student);
	Student fetch(Integer id);

}
