package com.te.encapsulation;

public class Voter {
	private String name;
	private int id;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
	
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
if (age>18) {
	this.age = age;
	System.out.println("you are eligible" +this.name);
}else {
	System.out.println("you are not Eligible" +this.name);
}
		
	}

}
