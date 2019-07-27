package com.skilldistillery.jet;

public class BomberJet extends Jet{
private int payload;
	public BomberJet() {
		super();
	}

	public BomberJet(String model, double speed, int range, long price, int payload) {
		super(model, speed, range, price);
		this.payload = payload;
	}

	
	
	
}
