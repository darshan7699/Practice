package com.te.abstraction;

public class Rotwheeler extends Dog {
	
 public Rotwheeler(String name,String ownername) {
	 super(name,ownername);
 }
 
	@Override
	public void bark() {
	System.out.println("boooooow");	
	}

	@Override
	public void eat() {
	System.out.println("pedigree and milk");
		
	}
	

}
