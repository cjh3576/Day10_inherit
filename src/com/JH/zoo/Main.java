package com.JH.zoo;

import com.JH.himart.AirPlane;

public class Main {

	public static void main(String[] args) {
		Eagle e = new Eagle();
		
		Animal a = e;
		Birds b = e;
		Flyable f =e;
		
		AirPlane air = new AirPlane();
		Flyable f2 = air;
		
		
	}

}
