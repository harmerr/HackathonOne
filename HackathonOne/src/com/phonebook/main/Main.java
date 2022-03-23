//Users:
//Date Created:

package com.phonebook.main;

import java.util.*;

public class Main {

	// ArrayList Contact
	// ArrayList<Contact> contact = new ArrayList<Contact>();

	public static void main(String[] args) {

		//ArrayList Contact
		ArrayList<Contact> contact = new ArrayList<Contact>();
		contact.add(new Contact());
		//String name;String phoneNumber;createdAt;
		
		Scanner input = new Scanner(System.in);

		
		
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
		
		
		//System.out.println("Import Person Or Organization");
	
		
		//Create object For organization & Person
		//Menu Options
		//Do while loop
		//Ask user for inputs questions
		//Asks the user whether they want to add a person or organization.

		//Scanner class
		//HashMap to store all search results ID & Name
		//File Writer,File Reader
		
		
	
	
		while (true) {
			System.out.println("Enter desired action: [add] [list] [count] " + "[info] [delete] [search] [exit]");

			String userInput = input.nextLine();

			boolean breakLoop = false;
			
			switch (userInput) {
			case "add":
				add();
				break;
			case "list":
				add();
				break;
			case "count":
				add();
				break;
			case "info":
				add();
				break;
			case "delete":
				add();
				break;
			case "search":
				add();
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
		// Menu Options
		// Do while loop
		// Ask user for inputs questions
		// Asks the user whether they want to add a person or organization.

		// Scanner class
		// HashMap to store all search results ID & Name
		// File Writer,File Reader

	}

	// **MENU METHODS**

	public static void add() {
		System.out.println("Hello");
	}

	public static void list() {

	}

	public static void count() {

	}

	public static void info() {

	}

	public static void delete() {

	}

	public static void search() {

	}

	public static void exit() {

	}
}
