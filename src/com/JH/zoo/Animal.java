package com.JH.zoo;

public abstract class Animal {
	
	private String color;
	private double height;
	private double weight;
	private int age;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	} 


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void eat() {};
	
	
	
	
}
