package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private int speed, range;
	private double price;

	public Jet (String model, int speed, int range, double price) {
		this.model = new String(model);
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {};
}
