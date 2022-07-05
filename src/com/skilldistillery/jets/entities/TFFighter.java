package com.skilldistillery.jets.entities;

public class TFFighter extends TurboFan implements Attack {

	public TFFighter (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public boolean getTargetLock() {
		return true;
	}
}
