package com.te.customexception;

public class Voter {
 private String name;
 private int age;
 private int srno;
 
 
public Voter(String name, int age, int srno) {
	super();
	this.name = name;
	this.age = age;
	this.srno = srno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSrno() {
	return srno;
}
public void setSrno(int srno) {
	this.srno = srno;
}
 
 
}
