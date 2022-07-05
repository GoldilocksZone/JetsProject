package com.skilldistillery.jets.entities;

public abstract class TurboProp extends TurboShaft {

	public TurboProp (String model, int speed, int range, double price) {
		super(model, speed, range, price, "TUKTUKTUKTUKREEEEEEE!!!");
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.toString());
		string.append("\n");
		string.append("Rotational Device: propeller");
		string.append("\n");
		return string.toString();
	}
}
