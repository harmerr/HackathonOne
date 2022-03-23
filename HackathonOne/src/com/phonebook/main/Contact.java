//David Toribio

package com.phonebook.main;

import java.time.LocalDateTime;

public class Contact {

	protected String name;
	protected String phonebook;
	protected LocalDateTime createdAt;

	public Contact(String name, String phonebook) {
		super();
		this.name = name;
		this.phonebook = phonebook;
		this.createdAt = LocalDateTime.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonebook() {
		return phonebook;
	}

	public void setPhonebook(String phonebook) {
		this.phonebook = phonebook;
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