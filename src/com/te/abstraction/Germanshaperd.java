package com.te.abstraction;

public class Germanshaperd extends Dog{

	public Germanshaperd(String name,String ownername) {
		super(name,ownername);
	}
	@Override
	public void bark() {
		System.out.println("booooooow");
		
	}

	@Override
	public void eat() {
		System.out.println("pedigree and milk");
		
	}



}
