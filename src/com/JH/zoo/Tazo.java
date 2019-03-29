package com.JH.zoo;

public abstract class Tazo extends Birds {
	private int egg;
	public Tazo() {
		super();
	}
	public Tazo(int egg) {
		this.setEgg(egg);
	}
	public int getEgg() {
		return egg;
	}
	public void setEgg(int egg) {
		this.egg = egg;
	}
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
