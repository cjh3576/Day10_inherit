package com.JH.himart;

public class Customer {
	private int price;
	private int point;

	public Customer() {
		this.price = 100000000;
		this.point = 0;
	}

	public void buy (Product p) {
		
		this.price -= p.getPrice();
		this.point += p.getPoint();
		System.out.println("잔액 : " + this.price);
		System.out.println("현재 포인트 : " + this.point);
	}//현재잔액, 포인트




}
