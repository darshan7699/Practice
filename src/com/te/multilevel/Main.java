package com.te.multilevel;

public class Main {
public static void main(String[] args) {
Tigeer tiger = new Tigeer();
tiger.roar();
tiger.hunt();
tiger.walk();
Animal cat = new Cat();
cat.walk();
Animal tigeer = new Tigeer();
tigeer.walk();
Cat T=(Cat)tigeer;
T.hunt();
T.walk();
	
	
}
}
