package com.te_interface;

public class SmartPhone extends Phone {
  
	int ram;
	int cam;
	
	
	public SmartPhone(String name,double price,String color,int ram, int cam) {
		super(name,price,color);
		this.ram = ram;
		this.cam = cam;
	}
	public void videoCall(String name) {
		System.out.println("calling.."+ name);
	}
	public void game(String name) {
		System.out.println("game"+name);
	}

}
