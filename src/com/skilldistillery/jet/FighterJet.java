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
	public void fly(Jet j, AirField airField) {
		super.fly(j, airField);
	}

	@Override
	public void fight(Jet j) {
		System.out.println();
		System.out.println(j.getModel() + " is joining fight!");
	}
	
	@Override
	public void loadWeapons(Jet j) {
		System.out.println();
		System.out.println(j.getModel() + " has all missiles loaded.");
	}

	@Override
	public String toString() {
		return "FighterJet [missleCapacity=" + missleCapacity + ", getModel()=" + getModel() + ", getSpeedMPH()="
				+ getSpeedMPH() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

}
