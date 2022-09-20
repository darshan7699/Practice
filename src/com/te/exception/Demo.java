package com.te.exception;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a;
		a=scanner.nextInt();
		int b;
		b=scanner.nextInt();
		
		
		try {
			int res =a/b;
			try {
				int[] c=null;
				System.out.println(c.length);
			} catch (NullPointerException e) {
				System.out.println("define a size"+ e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("denomitaor wrong"+e.getMessage());
		}
		

	}
}
