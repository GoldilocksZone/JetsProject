package com.skilldistillery.jets.entities;

public abstract class TurboJet extends Jet {

	public TurboJet (String model, int speed, int range, double price) {
		super(model, speed, range, price, "WONNNNNNNWONNNNNWONWONWONNNN");
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(super.toString());
		string.append("\n");
		string.append("Additional components: air intake, compressor, comnbustion chamber");
		string.append("\n");
		return string.toString();
	}
}
