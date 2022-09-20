package com.te.abstraction;

public abstract class Dog {
	public abstract void bark();
  public abstract void eat();
  String name;
  String ownername;
 
  
  public Dog(String name, String ownername) {
	super();
	this.name = name;
	this.ownername = ownername;
}
public void poop() {
	  System.out.println("dog is pooping");
  }
}
