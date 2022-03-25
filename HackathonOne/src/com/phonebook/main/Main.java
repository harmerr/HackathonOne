/**
 * @author SudhaPotla, ConnorGoodson, DavidToribio, RaymondHarmer
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

	//ArrayList for the phonebook is constructed here with the object type based on the Contact class
	static ArrayList<Contact> contact = new ArrayList<Contact>();
	
	//Scanner input to receive user choice in the upcoming menu
	static Scanner input = new Scanner(System.in);
	
	/* Main method -- three main functions for the phonebook application
	 * * First, to read from the saved ArrayList<Contact> object file which is written upon program close
	 * * Second, to present an interactive menu with various options for the user to choose
	 * * Third, to write an ArrayList<Contact> object file that saves previous entries for the next time program is run
	 */
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Try-catch block to read from "arrayList.txt" file in relative folder if present (ArrayList<Contact> object)
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("..\\HackathonOne\\HackathonOne\\src\\com\\phonebook\\main\\arrayList.txt"));
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			contact = (ArrayList<Contact>) objectInputStream.readObject();
			
			objectInputStream.close();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Welcome to the Phonebook Application");
		
		//While loop that displays to the user a phonebook menu, switch case that runs forever until "exit" is typed
		while(true) {

			System.out.println("\nEnter desired action: [add] [list] [count] " + "[info] [delete] [search] [exit]");

			String userInput = input.nextLine().toLowerCase();

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
		
		System.out.println("\nThank you, have a great day");

		//Upon exiting the menu but before the program closes, phonebook is written to arrayList.txt in relative folder
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

	/* The add() method takes user input to create a contact entry in the ArrayList<Contact>; first asking if it is a
	   person or an organization, then taking their unique attributes*/
	 
	public static void add() {

		System.out.println("Would you like to create a Person or Organization contact?");
		String userInput = input.nextLine().toLowerCase();

		//If user selects to create a person entry, the Person class attributes will be taken
		if(userInput.equals("person")) {
			
			System.out.println("Enter the person's name ");
			String userName = input.nextLine();

			System.out.println(("Enter the person's phone number "));
			String userNumber = input.nextLine();
			
			//Method that verifies if the phone number string is written in the xxx-xxx-xxxx format
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
			System.out.println("Contact added successfully!");
		}
		
		//If user selects to create an organization entry, the Organization class attributes will be taken
		else if(userInput.equals("organization")) {
			
			System.out.println("Enter the organization's name ");
			String userName = input.nextLine();

			System.out.println(("Enter the organization's phone number "));
			String userNumber = input.nextLine();

			//Method that verifies if the phone number string is written in the xxx-xxx-xxxx format
			boolean isNumberValid = Contact.verifier(userNumber);
			if(!isNumberValid) {  
				System.out.println("The phone number is not valid");
			
			}
			else {
				System.out.println("The phone number is valid!");
			}
			
			System.out.println("Enter the organization's website");
			String userWebsite = input.nextLine();

			LocalDateTime createdAt = LocalDateTime.now();

			contact.add(new Organization(userName, userNumber, createdAt, userWebsite));
			System.out.println("Contact added successfully!");
		}

	}

	//The list() method displays each entry in the ArrayList<Contact> with its numerical spot on the list
	
	public static void list() {
		
		for(int i = 0; i <= contact.size() - 1; i++) {
			System.out.println(i + " : " + contact.get(i).getName());
		}
	}
		
	//The count() method prints how many unique Contact objects (entries) are in the ArrayList<Contact>
	
	public static void count() {
		
		System.out.println("There are " + contact.size() + " entries in the phonebook");
	}

	/* The info() method brings up the list() method and allows the user to select an contact entry they would
	 * like to get more information about */
	
	public static void info() {

		list();
		
		System.out.println("\nEnter the ID number to get contact information");
		int userIDChoice = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i <= contact.size() - 1; i++) {
			if(i == userIDChoice) {
				System.out.println(contact.get(i));
			}
		}
	}

	/* The delete() method brings up the list() method and allows the user to select a contact entry they would
	 * like to delete */
	
	public static void delete() {
		
		list();
		
		System.out.println("\nEnter the ID number to delete the contact");
		int userIDChoice = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i <= contact.size() - 1; i++) {
			if(i == userIDChoice) {
				contact.remove(i);
				System.out.println("Contact successfully deleted!");
			}
		}
		
	}

	//The search() method allows the user to enter a name or part of a name to return matching contact entries
	
	public static void search() {
		
		System.out.println("\nPlease enter the name you would like to search.");
		String userSearch = input.nextLine().toLowerCase();
	
		for(int i = 0; i <= contact.size() - 1; i++) {
			
			if(contact.get(i).getName().toLowerCase().contains(userSearch)) {
				System.out.println(i + " : " + contact.get(i).getName() );
			}
		}    
	}
	
}

