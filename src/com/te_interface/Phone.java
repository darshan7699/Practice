package com.te_interface;

public class Phone {
	String name;
	double price;
	String color;
	public void call() {
		System.out.println("calling"+name);
	}
	public Phone(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public void text() {
		System.out.println("messege"+name);
	}
}
