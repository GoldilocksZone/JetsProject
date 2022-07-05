package com.skilldistillery.jets.entities;

import java.util.ArrayList;

public interface Transport {
	
	public ArrayList<String> getManifest();
	
	public int getCapacity();
	
	public void setCapacity(int capacity);
}
