package com.skilldistillery.jet;

public class FighterJet extends Jet implements CombatReady{
	private int missleCapacity;
	
	
	public FighterJet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FighterJet(String model, double speed, int range, long price, int missleCapacity) {
		super(model, speed, range, price);
		this.missleCapacity = missleCapacity;
	}

	@Override
	public void fight() {
		
	}

}
