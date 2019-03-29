package com.JH.himart;

public class Phone extends Product {
	private int inch;
	private String model;

		public Phone() {
		this.inch = 10;
		this.model = "S10";
		this.setBrand("Samsung");
		this.setColor("Black");
		this.setPrice(5000000);
		this.setPoint(5000);
		
	}

	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}




}
