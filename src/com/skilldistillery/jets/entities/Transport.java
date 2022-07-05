package com.skilldistillery.jets.entities;

import java.util.ArrayList;

public interface Transport {
	public int capacity = 0;
	
	public String units = null;
	
	public ArrayList<String> manifest = new ArrayList<>();
	
	public ArrayList<String> getManifest();
	
	public int getCapacity();
	
	public void setCapacity();
}
