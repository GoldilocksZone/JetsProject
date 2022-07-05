package com.skilldistillery.jets.entities;

import java.util.ArrayList;

public class TFPassengerTransport extends TurboFan implements Passenger {
	private int capacity = ((int) Math.random()*100);	
	
	public TFPassengerTransport (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public void load() {
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
		string.append("Total Capacity (passengers): " + this.getCapacity());
		string.append("\n");
		
		return string.toString();
	}
}
