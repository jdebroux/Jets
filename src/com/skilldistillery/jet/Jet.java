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
	
	public void fly(Jet j, AirField airField) {
		double flyTime = 0;
			flyTime = j.getRange()/j.getSpeedMPH(); 
			System.out.print(this.getModel() + " took off and started flying ");
			System.out.println("and can fly for " + ((double)Math.round(flyTime * 100 ))/100 + " hours.");
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + range;
		long temp;
		temp = Double.doubleToLongBits(speedMPH);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (range != other.range)
			return false;
		if (Double.doubleToLongBits(speedMPH) != Double.doubleToLongBits(other.speedMPH))
			return false;
		return true;
	}
	
	
	
}
