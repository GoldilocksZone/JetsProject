package com.skilldistillery.jets.entities;

public class TSAttackHelicopter extends TSHelicopter implements Attack {

	public TSAttackHelicopter (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	public boolean getTargetLock() {
		return true;
	}
}
