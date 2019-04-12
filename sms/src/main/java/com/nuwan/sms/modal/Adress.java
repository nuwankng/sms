package com.nuwan.sms.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adress {
	
	
	@Id
	private int id;
	private String street;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
