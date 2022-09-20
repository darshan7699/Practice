package com.te.practice;

public class Fibanoci {
	public static void main(String[] args) {

		int a1 = 0;
		int b2 = 1;
		int count = 10;
		int i,c3;
		System.out.println(a1 + " " + b2);
		for ( i = 2; i < count; i++) {
			c3=b2+a1;
			System.out.println(""+c3);
			a1=b2;
			b2=c3;
		}
		
	}
}
