package com.phonebook.main;

import java.time.LocalDateTime;

public class Person extends Contact {

	private String email;
	private String dob;

	public Person(String name, String phoneNumber, LocalDateTime createdAt, String email, String dob) {
		super(name, phoneNumber, createdAt);
		this.email = email;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [Name: " + name + ", date of birth: " + dob + ", eMail: " + email + ", phone number=" + phoneNumber
				+ ", created at: " + createdAt + "]";
	}
	
}