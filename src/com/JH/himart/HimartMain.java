package com.JH.himart;

public class HimartMain {

	public static void main(String[] args) {
		Computer computer = new Computer(); 
		Tv tv = new Tv();
		Phone phone = new Phone();
		HimartView mv = new HimartView();
		Customer cu = new Customer();
		
		Product [] products = new Product[3];
		products[0] = tv;
		products[1] = phone;
		products[2] = computer;
		
		mv.View(computer);
		mv.View(phone); 
		mv.View(tv);
		
		cu.buy(computer);
		cu.buy(phone);
		cu.buy(tv);
		Product p =tv;
		((Tv)p).getInch();
		System.out.println(((Tv)p).getInch());
		
		
		
		p=new Product();
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());
		
	}

}
