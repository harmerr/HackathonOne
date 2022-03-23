package com.phonebook.main;

import java.sql.Date;
import java.time.LocalDateTime;

public class Person extends Contact {

	private String email;
	private Date dob;

	public Person(String name, String phonebook, LocalDateTime createdAt, String email, Date dob) {
		super(name, phonebook, createdAt);
		this.email = email;
		this.dob = dob;
	}

@Override
public String toString() {
return "Person [email=" + email + ", dob=" + dob + ", getName()=" + getName() + ", getPhonebook()="
+ getPhonebook() + ", getcreatedAt()=" + getcreatedAt() + ", verifier()=" + verifier() + ", getClass()="
+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}