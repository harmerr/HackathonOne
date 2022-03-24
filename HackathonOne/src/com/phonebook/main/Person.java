package com.phonebook.main;

import java.util.*;
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
		return "Person [email=" + email + ", dob=" + dob + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", createdAt=" + createdAt + ", getName()=" + getName() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getcreatedAt()=" + getcreatedAt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}