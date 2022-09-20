package com.te.association.task;

import java.util.Scanner;

public class Delivery {
public static void main(String[] args) {
	Location location = new Location();
	location.place="Akole";
	location.street="Near maharaja hotel";
	Office office = new Office();
	location.adress=office;
	location.adress.name="Darshan Wawale";
	location.adress.area="South end circle";
	location.adress.landmark="INDIQUBE";
	System.out.println(location.adress.landmark);
	
	Scanner scanner=new Scanner(System.in);
	
}
}
