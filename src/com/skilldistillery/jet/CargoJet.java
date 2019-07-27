package com.skilldistillery.jet;

public class CargoJet extends Jet implements CargoCarrier{
	private int cargoVolume;
	
	
	public CargoJet() {
		super();
	}

	public CargoJet(String model, double speed, int range, long price, int cargoCapacity) {
		super(model, speed, range, price);
		this.cargoVolume = cargoCapacity;
	}
	
	@Override
	public void fly(Jet j, AirField airField) {
		super.fly(j, airField);
	}
	
	@Override
	public void loadCargo(Jet j) {
		System.out.println(j.getModel() + " is loading cargo.");
	}

	@Override
	public String toString() {
		return "CargoJet [cargoVolume=" + cargoVolume + ", getModel()=" + getModel() + ", getSpeedMPH()="
				+ getSpeedMPH() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

	
	
}
