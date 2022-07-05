package com.skilldistillery.jets.entities;

public class TJBomber extends TurboJet implements Bomb {
	private int currentAmmo = (int) Math.random()*4, ammoCapacity = 4;

	public TJBomber (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public String getAmmoType() {
		return new String(Bomb.ammoType);
	}
	
	public int getCurrentAmmo() {
		return this.currentAmmo;
	}
	
	public int getAmmoCapacity() {
		return this.ammoCapacity;
	}
	
	public void reload() {
		this.currentAmmo = this.ammoCapacity;
	}
	
	public void reload(int ammoCount) {
		this.currentAmmo += ammoCount;
	}
	
	public void engage() {
		System.out.println("I am deploying " + this.getAmmoType());
	}
	
	public String getHitOrMiss() {
		return ((int) Math.random()*2) == 1 ? "hit" : "miss";
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(this.getClass().getSimpleName() + ":");
		string.append("\n");
		string.append(super.toString());
		string.append("Ammo level: " + this.currentAmmo + "/" + this.ammoCapacity);
		string.append("\n");
		return string.toString();
	}
}
