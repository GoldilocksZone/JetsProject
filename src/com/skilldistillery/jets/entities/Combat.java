package com.skilldistillery.jets.entities;

public interface Combat {

	public String getAmmoType();
	
	public int getCurrentAmmo();
	
	public int getAmmoCapacity();
	
	public void reload();
	
	public void reload(int ammoCount);
	
	public void engage();
	
}
