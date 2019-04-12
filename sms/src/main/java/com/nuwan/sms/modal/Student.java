package com.nuwan.sms.modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity
public class Student {
	@Id
	private Integer id;
	private String name;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Adress address;
	
	@OneToMany(mappedBy="student",cascade = CascadeType.ALL)
	//@JoinColumn(name="id")
	List<Telephone> telephones;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "student_course",
			joinColumns = @JoinColumn(name = "sid", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "cid" , referencedColumnName = "id")
			
			
	)
	
	private List<Course> courses;
	


	
	
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public List<Telephone> getTelephones() {
		return telephones;
	}
	public void setTelephones(List<Telephone> telephones) {
		this.telephones = telephones;
	}
	public Integer getId() {
		return id;
	}
	public Adress getAddress() {
		return address;
	}
	public void setAddress(Adress address) {
		this.address = address;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
