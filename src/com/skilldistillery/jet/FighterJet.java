package com.skilldistillery.jet;

public class FighterJet extends Jet implements CombatReady {
	private int missleCapacity;

	public FighterJet() {
		super();
	}

	public FighterJet(String model, double speed, int range, long price, int missleCapacity) {
		super(model, speed, range, price);
		this.missleCapacity = missleCapacity;
	}

	@Override
	public void fight() {//TODO

	}

	@Override
	public String toString() {
		return "FighterJet [missleCapacity=" + missleCapacity + ", getModel()=" + getModel() + ", getSpeedMPH()="
				+ getSpeedMPH() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

}
