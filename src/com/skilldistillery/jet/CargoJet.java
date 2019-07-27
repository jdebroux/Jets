package com.skilldistillery.jet;

public class CargoJet extends Jet implements CargoCarrier{
	private int cargoCapacity;
	
	
	public CargoJet() {
		super();
	}

	public CargoJet(String model, double speed, int range, long price, int cargoCapacity) {
		super(model, speed, range, price);
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	public void loadCargo() {
		System.out.println("Loading Cargo");
	}

}
