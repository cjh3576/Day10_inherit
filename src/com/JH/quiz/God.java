package com.JH.quiz;

public class God {
	private static final God  god= new God();
	
	private  God() {}
	
	public void say() {
		System.out.println("Today is Friday");
	}
		
	public static  God get() {
		
		
		return god;
	}
		
		
	
}
