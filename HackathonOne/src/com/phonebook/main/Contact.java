//David Toribio

package com.phonebook.main;

import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {

	protected String name;
	protected String phoneNumber;
	protected LocalDateTime createdAt;
	
	public Contact(String name, String phoneNumber, LocalDateTime createdAt) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.createdAt = createdAt;
	}

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
	
	public static boolean verifier(String phoneNumber) {
	
		
		Pattern ptrn = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}"); 
		Matcher match = ptrn.matcher(phoneNumber);
			
		return (match.find() && match.group().equals(phoneNumber));

	}

}