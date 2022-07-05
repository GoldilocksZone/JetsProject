package com.skilldistillery.jets.entities;

public class TSHelicopter extends TurboShaft {

	public TSHelicopter (String model, int speed, int range, double price) {
		super(model, speed, range, price, "FWUNKFWUNKFWUNKFWUNKFWUNK");
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(this.getClass().getSimpleName() + ":");
		string.append("\n");
		string.append(super.toString());
		string.append("\n");
		string.append("Rotational Device: rotary blades");
		string.append("\n");
		return string.toString();
	}
}
