package com.te.coupling;

public class Hyndai extends Car {

	@Override
	public void start() {
		System.out.println("hyundai is start");
	}

	@Override
	public void accelerate() {
		System.out.println("hyundai is go fast");
	}

	@Override
	public void stop() {
		System.out.println("stop by handbreak");
	}

}
