//David Toribio

package com.phonebook.main;

import java.time.LocalDateTime;

public class Contact {

	protected String name;
	protected String phonenumber;
	protected LocalDateTime createdat;

	public Contact(String name, String phonenumber) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.createdat = LocalDateTime.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getphonenumber() {
		return phonenumber;
	}

	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public LocalDateTime getCreatedat() {
		return createdat;
	}

	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}

	public boolean verifier() {
		return false;

	}



}