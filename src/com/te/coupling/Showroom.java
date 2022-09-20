package com.te.coupling;

public class Showroom {
	
	public void car() {
		System.out.println("Engine ready with 1000cc engine");
	}
	public void car1() {
		System.out.println("Engine ready with 1500cc engine");
	}
		
	Showroom showroom;
	public void getADriver(int car) {
		if(car==1) {
		
		this.showroom=new Showroom();
         showroom.car();
		
		}
		if(car==2) {
			

			this.showroom=new Showroom();

			showroom.car1();
		}
	}}

