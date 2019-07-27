package com.skilldistillery.jet;

import java.util.*;

public class AirField {
	private List<Jet> jetList = new ArrayList<>();

	public AirField() {
	}

	public List<Jet> getJets() {
		return jetList;
	}

	public void parkJet(Jet j) {
//		System.out.println(j);
		this.jetList.add(j);
	}
}
