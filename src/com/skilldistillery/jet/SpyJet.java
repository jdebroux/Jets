package com.skilldistillery.jet;

public class SpyJet extends Jet {
	private String radar;

	public SpyJet() {
		super();
	}

	public SpyJet(String model, double speed, int range, long price, String radar) {
		super(model, speed, range, price);
		this.radar = radar;
	}
	
	@Override
	public void fly(Jet j, AirField airField) {
		super.fly(j, airField);
	}

	@Override
	public String toString() {
		return "SpyJet [radar=" + radar + ", getModel()=" + getModel() + ", getSpeedMPH()=" + getSpeedMPH()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

}
