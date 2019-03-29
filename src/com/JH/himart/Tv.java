package com.JH.himart;

public class Tv extends Product {
	private int inch;
	public Tv() {
		this.inch = 60;
		this.setBrand("LG");
		this.setColor("Black");
		this.setPrice(3000000); 
		this.setPoint(3000);
		
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}


}
