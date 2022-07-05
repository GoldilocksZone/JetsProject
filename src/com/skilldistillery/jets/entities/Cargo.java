package com.skilldistillery.jets.entities;

public interface Cargo extends Transport {
	public String units = "pounds";
	
	public String getCargoUnits();
	
	public void loadCargo();
}
