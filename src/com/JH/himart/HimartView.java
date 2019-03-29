package com.JH.himart;

public class HimartView {
	
	public void View(Product p) {
		System.out.println("Brand : " +p.getBrand());
		System.out.println("Color : " + p.getColor());
		System.out.println("Price : " + p.getPrice());
		System.out.println("Point : " + p.getPoint());
		if( p instanceof Phone) {
			Phone ph = (Phone) p;
			System.out.println("Inch : " + ph.getInch());
			System.out.println("Model : " + ph.getModel());
		}
		else if (p instanceof Computer) {
			Computer c = (Computer)p;
			System.out.println("Cpu : " + c.getCpu());
			System.out.println("Volume : " + c.getVolume());
		}
		else {
			Tv t = (Tv) p;
			System.out.println("Inch : " + t.getInch());
		}
		System.out.println("==============================");
	}
	

	

	
	
}
