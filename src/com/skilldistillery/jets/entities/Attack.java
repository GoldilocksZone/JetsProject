package com.skilldistillery.jets.entities;

public interface Attack extends Combat {
	public String ammoType = "bullets and missiles";
	
	public boolean getTargetLock();
}
