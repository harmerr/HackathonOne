package com.phonebook.main;

import java.time.LocalDateTime;

public class Organization extends Contact {

	String website;

	public Organization(String name, String phoneNumber,  String website) {
		super(name, phoneNumber);
		this.website = website;
	}

	@Override
	public String toString() {
		return "Organization [website=" + website + ", getName()=" + getName() + ", getphoneNumber()=" + getphoneNumber()
				+ ", getcreatedAt()=" + getcreatedAt() + ", verifier()=" + verifier() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}