package com.skilldistillery.jets.app;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.TJBomber;
import com.skilldistillery.jets.entities.TJFighterBomber;
import com.skilldistillery.jets.entities.TFFighter;
import com.skilldistillery.jets.entities.TPCargoPassengerTransport;
import com.skilldistillery.jets.entities.TSAttackHelicopter;
import com.skilldistillery.jets.entities.TSTransportHelicopter;
import com.skilldistillery.jets.entities.TFPassengerTransport;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JetsApplication {
	private String fleetData = "jets.txt";

	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();
		
		jetsApp.run();
	}

	public void run() {
		AirField airField = this.readFleet();
	}
	
	public AirField readFleet() {
		AirField airField = new AirField();
		try (BufferedReader br = new BufferedReader(new FileReader(fleetData))) {
			String line;
			String[] fields;
			while ((line = br.readLine()) != null) {
				if (line.charAt(0) != '#') {
					fields = line.split(",");
					switch (fields[0]) {
					case "TJBomber":
						airField.addJet(new TJBomber(fields[3],
													Integer.parseInt(fields[7]),
													Integer.parseInt(fields[8]),
													Long.parseLong(fields[9])));
						break;
					case "TJFighterBomber":
						airField.addJet(new TJFighterBomber(fields[3],
													Integer.parseInt(fields[7]),
													Integer.parseInt(fields[8]),
													Long.parseLong(fields[9])));
						break;
					case "TFFighter":
						airField.addJet(new TFFighter(fields[3],
													Integer.parseInt(fields[7]),
													Integer.parseInt(fields[8]),
													Long.parseLong(fields[9])));
						break;
					case "TPCargoPassengerTransport":
						airField.addJet(new TPCargoPassengerTransport(fields[3],
													Integer.parseInt(fields[7]),
													Integer.parseInt(fields[8]),
													Long.parseLong(fields[9])));
						break;
					case "TSAttackHelicopter":
						airField.addJet(new TSAttackHelicopter(fields[3],
													Integer.parseInt(fields[7]),
													Integer.parseInt(fields[8]),
													Long.parseLong(fields[9])));
						break;
					case "TSTransportHelicopter":
						airField.addJet(new TSTransportHelicopter(fields[3],
								Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]),
								Long.parseLong(fields[9])));
						break;
					case "TFPassengerTransport":
						airField.addJet(new TFPassengerTransport(fields[3],
								Integer.parseInt(fields[7]),
								Integer.parseInt(fields[8]),
								Long.parseLong(fields[9])));
						break;
					}
						
				}
			}
		} catch (IOException e) {
			System.out.println("IOException: Check filename and file type.");
		}
		return airField;
	}
}
