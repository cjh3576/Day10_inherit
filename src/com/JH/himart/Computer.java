package com.JH.himart;

public class Computer extends Product {

	private String volume;
	private String cpu;
	public Computer() {

		this.cpu = "i7";
		this.volume = "1TB";
		this.setBrand("Samsung"); 
		this.setColor("Silver");
		this.setPrice(2000000);
		this.setPoint(2000);
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	

}
