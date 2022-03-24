package com.phonebook.main;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Organization extends Contact implements Serializable {

	String website;

	public Organization(String name, String phoneNumber, LocalDateTime createdAt, String website) {
		super(name, phoneNumber, createdAt);
		this.website = website;
	}

	@Override
	public String toString() {
		return "Organization [Company name: " + name + ", website: " + website + ", phone number: " + phoneNumber + ", created at: "
				+ createdAt + "]";
	}

}