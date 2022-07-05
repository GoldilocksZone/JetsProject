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
	
}
