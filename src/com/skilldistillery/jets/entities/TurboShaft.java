package com.skilldistillery.jets.entities;

public abstract class TurboShaft extends Jet {

	public TurboShaft (String model, int speed, int range, double price, String flyingNoise) {
		super(model, speed, range, price, flyingNoise);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
