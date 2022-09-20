package com.te.coupling;

public class BMW extends Car{

	@Override
	public void start() {
	System.out.println("BMW is start");	
		
	}

	@Override
	public void accelerate() {
		System.out.println("BMW is driving fast");
		
	}

	@Override
	public void stop() {
		System.out.println("stop by brake");
		
	}
	

}
