package com.te.abstraction;

public class Owner {
public static void main(String[] args) {
	Germanshaperd germanshaperd = new Germanshaperd("Charlie","sandesh");
	
	germanshaperd.bark();
	germanshaperd.eat();
	germanshaperd.poop();
	System.out.println("=============================");
	Rotwheeler rotwheeler = new Rotwheeler("jollie"," bhagwat");
	rotwheeler.bark();
	rotwheeler.eat();
	rotwheeler.poop();
}
}
