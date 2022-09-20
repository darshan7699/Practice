package com.te.exception;

public class Throw {
public static void main(String[] args) {
	System.out.println("program start");
	try {
		throw new Exception();
		} catch (Exception e) {
System.out.println("checked exception handle");
		}
	try {
	throw new RuntimeException();	
	} catch (Exception e) {
System.out.println("exception handle");
	}
	System.out.println("programm end ");
}
}
