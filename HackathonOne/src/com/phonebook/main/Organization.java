package com.phonebook.main;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Organization extends Contact implements Serializable {

	//Public website attribute for the Organization child class
	public String website;

	//Constructor for the Organization class
	public Organization(String name, String phoneNumber, LocalDateTime createdAt, String website) {
		super(name, phoneNumber, createdAt);
		this.website = website;
	}

	//toString to return Organization object attributes to print
	@Override
	public String toString() {
		return "Organization [Company name: " + name + ", website: " + website + ", phone number: " + phoneNumber + ", created at: "
				+ createdAt + "]";
	}

}