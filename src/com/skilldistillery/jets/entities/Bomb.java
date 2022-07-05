package com.skilldistillery.jets.entities;

public interface Bomb extends Combat{
	public String ammoType = "bomb";
	
	public String getHitOrMiss();
}
