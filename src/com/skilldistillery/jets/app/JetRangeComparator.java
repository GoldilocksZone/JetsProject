package com.skilldistillery.jets.app;

import java.util.Comparator;

import com.skilldistillery.jets.entities.Jet;

public class JetRangeComparator implements Comparator<Jet> {

	public int compare(Jet jet1, Jet jet2) {
		if (jet1.getRange() == jet2.getRange()) {
			return 0;
		} else if (jet1.getRange() > jet2.getRange()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
