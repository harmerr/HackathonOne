//Users:
//Date Created:

package com.phonebook.main;

import java.util.*;

public class Main {

	// ArrayList Contact
	// ArrayList<Contact> contact = new ArrayList<Contact>();

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter desired action: [add] [list] [count]" + "[info] [delete] [search] [exit]");

			String userInput = input.nextLine();

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
				add();
				break;
			
			}
		}
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
