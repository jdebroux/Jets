package com.skilldistillery.jet;

public class PassengerJet extends Jet {
	private int passengerCapacity;

	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, double speed, int range, long price, int passengerCapacity) {
		super(model, speed, range, price);
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return "PassengerJet [passengerCapacity=" + passengerCapacity + ", getModel()=" + getModel()
				+ ", getSpeedMPH()=" + getSpeedMPH() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice()
				+ "]";
	}

}
