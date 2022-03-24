/**
 * @author SudhaPotla, ConnorGoodson, David Toribio, Raymond Harmer
 */

package com.phonebook.main;

import java.time.LocalDateTime;
import java.util.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;

public class Main {

	static ArrayList<Contact> contact = new ArrayList<Contact>();
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("..\\HackathonOne\\HackathonOne\\src\\com\\phonebook\\main\\arrayList.txt"));
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			contact = (ArrayList<Contact>) objectInputStream.readObject();
			
			objectInputStream.close();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		
	/*	HashMap<String, String> organizations = new  HashMap <String, String> (); 
		HashMap<String, String> persons = new HashMap <String, String> (); 
		organizations.put(null, null);
		organizations.remove(null, null); 
		organizations.get(null, null); 
		persons.put(null, null); 
		persons.remove(null, null); 
		persons.get(null, null); 
		persons.put(null, null); 
		
		
		//this prints keys using a for loop
		 
		for(String a : organizations.keySet()) {
			System.out.println(a);
			
			}
		
		for(String b : persons.keySet()) {
			System.out.println(b);
			
			}
			
		//this prints values using a for loop
		 
		 for(String c : organizations.values()) {
		 	System.out.println(c); 
		 	
		 	}
			
		for(String d : persons.valuse()) {	
			System.out.println(d);
			
			}
			
		// this prints the keys and values using a for loop
		 
		 for(String e : organizations.keySet()) {
		 	System.out.println ("key: " + e + "value: " + organizations.get(e));
		 	
		 	}
			
			for(String f : persons.keySet()) {
		 	System.out.println ("key: " + f + "value: " + persons.get(f));
		 	
		 	}
		
		this is the basic layout for the hashMap
		until we can firgure out how to implement these commands into the do-while loop
		
		*/
	
		while (true) {
			System.out.println("Enter desired action: [add] [list] [count] " + "[info] [delete] [search] [exit]");

			String userInput = input.nextLine();

			boolean breakLoop = false;
			
			switch (userInput) {
			case "add":
				add();
				break;
			case "list":
				list();
				break;
			case "count":
				count();
				break;
			case "info":
				info();
				break;
			case "delete":
				delete();
				break;
			case "search":
				search();
				break;
			case "exit":
				breakLoop = true;
				break;
			
			}
			
			if(breakLoop) {
				break;
			}
		}
		
		System.out.println("Thank you, have a great day.");
		
		// input.close();
		// System.out.println("Import Person Or Organization");

		// Create object For organization & Person
		//String name, String phoneNumber, String email, Date dob)
		//Person p=new Person(name, phoneNumber, email, dob);
		
		//(String name, String phoneNumber,  String website)
		//Organization o=new Organization(name,phoneNumber,website);
		
		// Menu Options
		// Do while loop
		// Ask user for inputs questions
		// Asks the user whether they want to add a person or organization.

		// Scanner class
		// HashMap to store all search results ID & Name
		// File Writer,File Reader

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File("..\\HackathonOne\\HackathonOne\\src\\com\\phonebook\\main\\arrayList.txt"));
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(contact);
			objectOutputStream.close();
		} 
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	// **MENU METHODS**

	public static void add() {

		System.out.println("Would you like to create a Person or Organization contact?");
		String userInput = input.nextLine().toLowerCase();

		if(userInput.equals("person")) {
			System.out.println("Enter the person's name ");
			String userName = input.nextLine();

			System.out.println(("Enter the person's phone number "));
			String userNumber = input.nextLine();
			
			boolean isNumberValid = Contact.verifier(userNumber);
			if(!isNumberValid) {  
				System.out.println("The Phone number is not valid");
			}
			else {
				System.out.println("The phone number is valid!");
			}
			

			System.out.println("Enter the person's email");
			String userEmail = input.nextLine();

			System.out.println("Enter the person's date of birth");
			String userDOB = input.nextLine();

			LocalDateTime createdAt = LocalDateTime.now();

			contact.add(new Person(userName, userNumber, createdAt, userEmail, userDOB));
			System.out.println("Contact added successfully! \n");
		}

		else if(userInput.equals("organization")) {
			System.out.println("Enter the organization's name ");
			String userName = input.nextLine();

			System.out.println(("Enter the organization's phone number "));
			String userNumber = input.nextLine();

			
			boolean isNumberValid = Contact.verifier(userNumber);
			if (!isNumberValid) {  
				System.out.println("The Phone number is not valid");
			
			} else {
				System.out.println("The phone number is valid!");
			}
			

			System.out.println("Enter the organization's website");
			String userWebsite = input.nextLine();

			LocalDateTime createdAt = LocalDateTime.now();

			contact.add(new Organization(userName, userNumber, createdAt, userWebsite));
			System.out.println("Contact added successfully! \n");
		}

	}

	public static void list() {
		
		for(int i = 0; i <= contact.size() - 1; i++) {
			System.out.println(i + " : " + contact.get(i).getName());
		}
	}
		
		
	public static void count() {
		
		System.out.println("There are " + contact.size() + " entries in the phonebook\n");
	}

	public static void info() {

		list();
		
		System.out.println("Enter the ID number to get contact information");
		int userIDChoice = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i <= contact.size() - 1; i++) {
			if(i == userIDChoice) {
				System.out.println(contact.get(i) + "\n");
			}
		}
	}

	public static void delete() {
		
		list();
		
		System.out.println("Enter the ID number to delete the contact");
		int userIDChoice = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i <= contact.size() - 1; i++) {
			if(i == userIDChoice) {
				contact.remove(i);
				System.out.println("Contact successfully deleted!\n");
			}
		}
		
	}

	public static void search() {
		
		System.out.println("Please enter the name you would like to search.");
		String userSearch = input.nextLine();
	
		for(int i = 0; i <= contact.size() - 1; i++) {
			
			if(contact.get(i).getName().contains(userSearch)) {
				System.out.println(i + " : " + contact.get(i).getName() );
			}
		}    
	}
	
}

