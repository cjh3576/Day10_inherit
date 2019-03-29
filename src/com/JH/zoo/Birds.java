package com.JH.zoo;

public abstract class Birds extends Animal {
	private String wing;
	
	public Birds() {
		// TODO Auto-generated constructor stub
	}
	public Birds(String wing) {
		this.wing = wing;
	}
	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing; 
	}
	
	
}
