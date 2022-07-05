package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model, flyingNoise;
	private int speed, range;
	private double price;

	public Jet (String model, int speed, int range, double price, String flyingNoise) {
		this.model = new String(model);
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.flyingNoise = flyingNoise;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getRange() {
		return this.range;
	}
	
	public String getModel() {
		return new String(this.model);
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Model: " + model);
		string.append("\n");
		string.append("Speed: " + speed + "mph");
		string.append("\n");
		string.append("Range: " + range + "mi");
		string.append("\n");
		string.append(String.format("Price: $%.2f", price));
		return string.toString();
	}
	
	public void fly() {
		System.out.println(this.flyingNoise);
		System.out.println("The following jet can fly for " + ((int) this.range / this.speed)+ " hours:");
		System.out.println(this.toString());
	}
}
