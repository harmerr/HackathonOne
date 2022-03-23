package com.phonebook.main;

import java.sql.Date;
import java.time.LocalDateTime;

public class Person extends Contact {

	private String email;
	private Date dob;

	public Person(String name, String phonebook, LocalDateTime createdat, String email, Date dob) {
		super(name, phonebook, createdat);
		this.email = email;
		this.dob = dob;
	}

@Override
public String toString() {
return "Person [email=" + email + ", dob=" + dob + ", getName()=" + getName() + ", getPhonebook()="
+ getPhonebook() + ", getCreatedat()=" + getCreatedat() + ", verifier()=" + verifier() + ", getClass()="
+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}