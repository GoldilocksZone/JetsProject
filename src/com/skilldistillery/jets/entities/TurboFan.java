package com.skilldistillery.jets.entities;

public abstract class TurboFan extends Jet {
	private String bypassLevel = null;
	
	public TurboFan (String model, int speed, int range, double price) {
		super(model, speed, range, price, "GRUNNNNNNNNN");
		this.bypassLevel = ((int) Math.random() * 2) == 1 ? "high bypass" : "low bypass";;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.toString());
		string.append("\n");
		string.append("Bypass level: " + bypassLevel);
		return string.toString();
	}
}
