package com.skilldistillery.jets.entities;

import java.util.ArrayList;

public class TSTransportHelicopter extends TSHelicopter implements Transport {
	private int capacity = ((int) Math.random()*100);	
	
	public TSTransportHelicopter (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public String getCargoUnits() {
		return new String(Cargo.units);
	}
	
	public void loadCargo() {
		System.out.println("Loading cargo...");
	}
	
	public void boardPassengers() {
		System.out.println("Boarding all passengers...");
	}
	
	public ArrayList<String> getManifest() {
		return new ArrayList<String>();
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(this.getClass().getSimpleName() + ":");
		string.append("\n");
		string.append(super.toString());
		string.append("\n");
		string.append("Total Capacity: " + this.getCapacity() + " " + this.getCargoUnits());
		string.append("\n");
		
		return string.toString();
	}
}
