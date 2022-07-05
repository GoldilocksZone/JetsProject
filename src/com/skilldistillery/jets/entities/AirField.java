package com.skilldistillery.jets.entities;

import java.util.List;
import java.util.ArrayList;

public class AirField {
	private List<Jet> fleet;
	
	public AirField () {
		this.fleet = new ArrayList<>();
	}
	
	public void addJet(Jet jet) {
		this.fleet.add(jet);
	}
	
	public List<Jet> getFleet() {
		return new ArrayList<Jet>(this.fleet);
	}
	
	public String toString() {
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < this.fleet.size(); i++) {
			string.append(this.fleet.get(i).toString());
			string.append("\n");
		}
		return string.toString();
	}
	
}
