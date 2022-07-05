package com.skilldistillery.jets.entities;

import java.util.ArrayList;

public class TFPassengerTransport extends TurboShaft implements Passenger {

	public TFPassengerTransport (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public void boardPassengers() {
		
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
