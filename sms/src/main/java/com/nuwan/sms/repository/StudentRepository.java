package com.nuwan.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuwan.sms.modal.Student;

public interface StudentRepository extends JpaRepository<Student , Integer>{

}
