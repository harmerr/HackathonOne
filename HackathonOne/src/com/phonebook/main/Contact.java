//David Toribio

package com.phonebook.main;

import java.time.LocalDateTime;

public class Contact {

	protected String name;
	protected String phoneNumber;
	protected LocalDateTime createdAt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getcreatedAt() {
		return createdAt;
	}

	public void setcreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public boolean verifier() {
		return false;

	}

}