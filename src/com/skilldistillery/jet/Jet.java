package com.skilldistillery.jet;

public abstract class Jet {
	private String model;
	private double speedMPH;
	private int range;
	private long price;
	
	public Jet() {
	}
	
	public Jet(String model, double speed, int range, long price) {
		super();//not needed to reach up to 'object' but leaving it to have super()
		this.model = model;
		this.speedMPH = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedMPH() {
		return speedMPH;
	}

	public void setSpeedMPH(double speedMPH) {
		this.speedMPH = speedMPH;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedMPH=" + speedMPH + ", range=" + range + ", price=" + price + "]";
	}
	
	
	
}
