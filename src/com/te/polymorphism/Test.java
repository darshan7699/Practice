package com.te.polymorphism;

public class Test {
	public static void main(String[] args) {
//	Calculator calculator = new Calculator();
//	int add=calculator.add(10,10);
//	int add2=calculator.add2(1,2,14);
//	System.out.println(add);
//	System.out.println(add2);
Calculator cal=new ScientificCalculator();
cal.add(10,12);
cal.add2(0,2,4);
System.out.println(cal.add(10, 20 ));
	}
}
	