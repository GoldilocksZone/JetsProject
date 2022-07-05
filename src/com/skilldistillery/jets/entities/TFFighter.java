package com.skilldistillery.jets.entities;

public class TFFighter extends TurboFan implements Attack {
	private int currentAmmo = (int) Math.random()*100, ammoCapacity = 100;
	
	public TFFighter (String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public boolean getTargetLock() {
		return ((int) Math.random()*2) == 1 ? true : false;
	}
	
	public String getAmmoType() {
		return new String(Attack.ammoType);
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
		System.out.println("I am shooting " + this.getAmmoType());
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append(this.getClass().getSimpleName() + ":");
		string.append("\n");
		string.append(super.toString());
		string.append("\n");
		string.append("Ammo level: " + this.currentAmmo + "/" + this.ammoCapacity);
		string.append("\n");
		return string.toString();
	}
}
