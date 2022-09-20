package com.te.association;

public class Office {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.name="darshan";
	employee.id=2015;
	employee.phoneNo=9146410204l;
	Adress adress = new Adress();
	adress.buildingNo="B25";
	adress.landmark="YCM HOSPITAL";
	adress.pincode=422601;
	
	employee.adress=adress;
	     
	System.out.println(employee.name);
	System.out.println(employee.id);
	System.out.println(employee.phoneNo);
	System.out.println(employee.adress.buildingNo);
	System.out.println(employee.adress.landmark);
	System.out.println(employee.adress.pincode);
	
	
}
}
