package com.te.coupling;

public class Driver {
	Car car2;
	
	
	public void getACar(int car) {
	if(car==1) {
	this.car2=new Hyndai();
	car2.start();
	car2.accelerate();
	car2.stop();

	}
	if(car==2) {
		this.car2=new BMW();
		car2.start();
		car2.accelerate();
		car2.stop();

	}
	if(car==3&car>3){
		
		System.out.println("read carefully man");
	}
	
	
	
	}
}

