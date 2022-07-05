package com.skilldistillery.jets.entities;

public class JetImpl extends Jet {

	public JetImpl (String model, int speed, int range, double price) {
		super(model, speed, range, price, "Standard Jet Sounds");
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.getClass().getSimpleName() + ":");
		string.append("\n");
		string.append(super.toString());
		string.append("\n");
		return string.toString();
	}
}
