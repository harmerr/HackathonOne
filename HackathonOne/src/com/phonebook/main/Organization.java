package com.phonebook.main;

import java.time.LocalDateTime;

public class Organization extends Contact {

	String website;

	public Organization(String name, String phoneNumber, LocalDateTime createdAt, String website) {
		super(name, phoneNumber, createdAt);
		this.website = website;
	}

	@Override
	public String toString() {
		return "Organization [website=" + website + ", name=" + name + ", phoneNumber=" + phoneNumber + ", createdAt="
				+ createdAt + ", getName()=" + getName() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getcreatedAt()=" + getcreatedAt() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}