package com.skilldistillery.jet;

public class PassengerJet extends Jet implements CargoCarrier {
	private int passengerCapacity;

	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, double speed, int range, long price, int passengerCapacity) {
		super(model, speed, range, price);
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public void loadCargo(Jet j) {
		System.out.println();
		System.out.println(j.getModel() + " is loading all passengers luggage.");
	}

	@Override
	public void fly(Jet j, AirField airField) {
		super.fly(j, airField);
	}

	@Override
	public String toString() {
		return "PassengerJet [passengerCapacity=" + passengerCapacity + ", toString()=" + super.toString() + "]";
	}

}
