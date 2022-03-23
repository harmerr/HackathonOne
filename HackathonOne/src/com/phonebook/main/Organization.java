package com.phonebook.main;

import java.time.LocalDateTime;

public class Organization extends Contact {

	String website;

	public Organization(String name, String phonebook,  String website) {
		super(name, phonebook);
		this.website = website;
	}

	@Override
	public String toString() {
		return "Organization [website=" + website + ", getName()=" + getName() + ", getPhonebook()=" + getPhonebook()
				+ ", getcreatedAt()=" + getcreatedAt() + ", verifier()=" + verifier() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}