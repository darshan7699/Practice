package com.te.coupling;
import java.util.Scanner;

public class Owner {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter you want 1 for Hyndai and 2 for BMW ");
	int nextInt = scanner.nextInt();
	System.out.println("enter 1 for black color & 2 for blue");
	int nextInt2 = scanner.nextInt();
	Choice choice = new Choice();
	choice.getADriver(nextInt);
	System.out.println();
	System.out.println("enter 1 for 1000CC & 2 for 1500CC");
	int nextInt3 = scanner.nextInt();
	Showroom showroom = new Showroom();
	showroom.getADriver(nextInt3);
	System.out.println();
	System.out.println("enter");
	int nextInt4 = scanner.nextInt();
	Driver driver = new Driver();
	driver.getACar(nextInt4);
	
	
}	
}
