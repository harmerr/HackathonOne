package com.phonebook.main;

import java.time.LocalDateTime;
import java.io.Serializable;

public class Person extends Contact implements Serializable {

	//Private attributes for the Person child class
	private String email;
	private String dob;

	//Constructor for the Person class
	public Person(String name, String phoneNumber, LocalDateTime createdAt, String email, String dob) {
		super(name, phoneNumber, createdAt);
		this.email = email;
		this.dob = dob;
	}

	//toString() to return Person object attributes to print
	@Override
	public String toString() {
		return "Person [Name: " + name + ", date of birth: " + dob + ", eMail: " + email + ", phone number=" + phoneNumber
				+ ", created at: " + createdAt + "]";
	}
	
}