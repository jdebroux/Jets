package com.skilldistillery.jet;

public class BomberJet extends Jet implements CombatReady{
	private int payload;

	public BomberJet() {
		super();
	}

	public BomberJet(String model, double speed, int range, long price, int payload) {
		super(model, speed, range, price);
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "BomberJet [payload=" + payload + ", getModel()=" + getModel() + ", getSpeedMPH()=" + getSpeedMPH()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

	@Override
	public void fight() {//TODO
		
	}

}
