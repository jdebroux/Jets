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
	public void fly(Jet j, AirField airField) {
		super.fly(j, airField);
	}

	@Override
	public void fight(Jet j) {
		System.out.println();
		System.out.println(j.getModel() + " is bombing enemy resources!");
	}
	
	@Override
	public void loadWeapons(Jet j) {
		System.out.println();
		System.out.println(j.getModel() + " has all bombs loaded.");
	}

	@Override
	public String toString() {
		return "BomberJet [payload=" + payload + ", getModel()=" + getModel() + ", getSpeedMPH()=" + getSpeedMPH()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}


}
