package com.skilldistillery.jets.entities;

import java.util.ArrayList;

public class TPCargoPassenger extends TurboProp implements Cargo, Passenger {

	public void loadCargo() {
		
	}
	
	public ArrayList<String> getManifest() {
		return new ArrayList<String>();
	}
	
	public int getCapacity() {
		return 0;
	}
	
	public void setCapacity() {
		
	}

}
