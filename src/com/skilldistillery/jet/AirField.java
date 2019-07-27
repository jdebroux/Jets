package com.skilldistillery.jet;

import java.util.*;

public class AirField {

	private Set<Jet> jetSet = new TreeSet<>();

	public AirField() {
	}

	public Set<Jet> getJets() {
		return jetSet;
	}

	public void parkJet(Jet j) {
		this.jetSet.add(j);
	}
}
