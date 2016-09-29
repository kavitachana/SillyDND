package com.app;

import java.util.Scanner;

import com.parents.*;
import com.ourchars.*;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean userInputCorrect = false;
		
		ElfJedi ourElfJedi = makeElfJedi();
		
		System.out.println(ourElfJedi.getHealth());

		 do {
			System.out.println("Welcome to Silly D'n'D\n" 
					+ "Would you like to play as a\n" 
					+ "1. Human Wizard\n"
					+ "2. Elf Royal\n" 
					+ "3. Twi'lek Jedi\n" 
					+ "4. Smurf Warrior\n" 
					+ "5. Turle Ninja");
			String userInput = sc.nextLine();
			
			
			switch (userInput) {
			case "1":
				// Call to humanWizard methods here
				break;
			case "2":
				// Call to elfRoyal methods
				break;
			case "3":
				// Call to twilekJedi methods
				break;
			case "4":
				// Call to smurfWarrior methods
				break;
			case "5":
				// Call to turleNinja methods
				break;
			default:
				userInputCorrect = true;
				System.out.println("You've entered an invalid choice.\n"
						+ "1, 2, 3, 4, 5 are your choices.\n");
				break;
			}
		} while (userInputCorrect);
		 
	}

	private static ElfJedi makeElfJedi() {
		
		ElfJedi ourElfJedi = new ElfJedi();
		
		ourElfJedi.setHealth(0);
		ourElfJedi.changeHealth();
		
		return ourElfJedi;
	}
	
}
