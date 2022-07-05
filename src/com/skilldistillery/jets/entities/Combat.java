package com.skilldistillery.jets.entities;

public interface Combat {
	public int currentAmmo = 0, ammoCapacity = 100;
	
	public String ammoType = null;
	
	public int getCurrentAmmo();
	
	public void reload();
	
	public void reload(int ammoCount);
	
	public void engage();
}
