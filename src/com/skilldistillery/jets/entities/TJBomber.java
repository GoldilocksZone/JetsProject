package com.skilldistillery.jets.entities;

public class TJBomber extends TurboJet implements Bomb {

	public TJBomber (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	public int getCurrentAmmo() {
		return 0;
	}
	
	public void reload() {
		
	}
	
	public void reload(int ammoCount) {
		
	}
	
	public void engage() {
		
	}
	
	public String getHitOrMiss() {
		return null;
	}
}
