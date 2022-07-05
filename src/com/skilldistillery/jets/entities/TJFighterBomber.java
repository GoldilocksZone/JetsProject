package com.skilldistillery.jets.entities;

public class TJFighterBomber extends TurboJet implements Attack, Bomb {

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
	
	public boolean getTargetLock() {
		return true;
	}
}
