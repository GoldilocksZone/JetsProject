package com.skilldistillery.jets.app;

import java.util.Comparator;

import com.skilldistillery.jets.entities.Jet;

public class JetSpeedComparator implements Comparator<Jet> {

	public int compare(Jet jet1, Jet jet2) {
		if (jet1.getSpeed() == jet2.getSpeed()) {
			return 0;
		} else if (jet1.getSpeed() > jet2.getSpeed()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
