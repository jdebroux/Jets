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
	public void loadCargo() {
		System.out.println("Loading Cargo");
	}

	@Override
	public String toString() {
		return "CargoJet [cargoVolume=" + cargoVolume + ", getModel()=" + getModel() + ", getSpeedMPH()="
				+ getSpeedMPH() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

	
	
}
