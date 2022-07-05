package com.skilldistillery.jets.entities;

import java.util.ArrayList;

public class TSTransportHelicopter extends TSHelicopter implements Transport {

	public TSTransportHelicopter (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public ArrayList<String> getManifest() {
		return new ArrayList<String>();
	}
	
	public int getCapacity() {
		return 0;
	}
	
	public void setCapacity() {
		
	}
}
