package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.TJBomber;
import com.skilldistillery.jets.entities.TJFighterBomber;
import com.skilldistillery.jets.entities.TFFighter;
import com.skilldistillery.jets.entities.TPCargoPassengerTransport;
import com.skilldistillery.jets.entities.TSAttackHelicopter;
import com.skilldistillery.jets.entities.TSTransportHelicopter;
import com.skilldistillery.jets.entities.TFPassengerTransport;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class JetsApplication {
	private String fleetData = "jets.txt";

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();

		jetsApp.run();
	}

	public void run() {
		AirField airField = this.readFleet();

		this.printHeader();
		this.printInstructions();
		this.printMenuOptions();
		this.fulfillUserRequest(airField.getFleet(), this.getSelection());
	}

	public AirField readFleet() {
		AirField airField = new AirField();
		try (BufferedReader br = new BufferedReader(new FileReader(this.fleetData))) {
			String line;
			String[] fields;
			while ((line = br.readLine()) != null) {
				if (line.charAt(0) != '#') {
					fields = line.split(",");
					switch (fields[0]) {
					case "TJBomber":
						airField.addJet(new TJBomber(fields[3], Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]), Long.parseLong(fields[9])));
						break;
					case "TJFighterBomber":
						airField.addJet(new TJFighterBomber(fields[3], Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]), Long.parseLong(fields[9])));
						break;
					case "TFFighter":
						airField.addJet(new TFFighter(fields[3], Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]), Long.parseLong(fields[9])));
						break;
					case "TPCargoPassengerTransport":
						airField.addJet(new TPCargoPassengerTransport(fields[3], Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]), Long.parseLong(fields[9])));
						break;
					case "TSAttackHelicopter":
						airField.addJet(new TSAttackHelicopter(fields[3], Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]), Long.parseLong(fields[9])));
						break;
					case "TSTransportHelicopter":
						airField.addJet(new TSTransportHelicopter(fields[3], Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]), Long.parseLong(fields[9])));
						break;
					case "TFPassengerTransport":
						airField.addJet(new TFPassengerTransport(fields[3], Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]), Long.parseLong(fields[9])));
						break;
					}

				}
			}
		} catch (IOException e) {
			System.out.println("IOException: Check filename and file type.");
		}
		return airField;
	}

	public void printHeader() {
		System.out.println("*****************");
		System.out.println("* Fleet Manager *");
		System.out.println("*****************");
		System.out.println();
	}

	public void printInstructions() {
		System.out.println("Please select an item from the following menu:");
	}

	public void printMenuOptions() {
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all transport jets");
		System.out.println("6. Engage in combat!");
		System.out.println("7. Add a jet to the fleet");
		System.out.println("8. Remove a jet from the fleet");
		System.out.println("9. Quit");
		System.out.println();

	}

	public int getSelection() {
		Scanner scanner = new Scanner(System.in);
		int selection = 9;
		System.out.print("> ");
		try {
			selection = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Invalid selection. Please try again.");
			selection = this.getSelection();
		}
		if (selection < 1 || selection > 9) {
			System.out.println("Invalid selection. Please try again.");
			selection = this.getSelection();
		} else {
			scanner.close();
			return selection;
		}
		scanner.close();
		return selection; // Ecipse gets angry if you don't include a return statement outside of a
							// control block.
	}

	public void fulfillUserRequest(AirField airField, int selection) {
		switch (selection) {
		case 1:
			listFleet();
			break;
		case 2:
			flyAllJets();
			break;
		case 3:
			displayFastestJet();
			break;
		case 4:
			displayJetWithLongestRange();
			break;
		case 5:
			loadAllTransportJets();
			break;
		case 6:
			engageInCombat();
			break;
		case 7:
			addJetToFleet();
			break;
		case 8:
			removeJetFromFleet();
			break;
		case 9:
			quit();
			break;
		}
	}

	public void listFleet() {
	}

	public void flyAllJets() {
	}

	public void displayFastestJet() {
	}

	public void displayJetWithLongestRange() {
	}

	public void loadAllTransportJets() {
	}

	public void engageInCombat() {
	}

	public void addJetToFleet() {
	}

	public void removeJetFromFleet() {
	}

	public void quit() {
		System.out.println("Quitting Fleet Manager...");
		System.exit(0);
	}
}
