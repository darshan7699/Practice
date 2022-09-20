package com.te.upcasting;

public class Admin extends User {
public void addUser(String name) {
	System.out.println( "adding "+name);
}
public void removeUser(String name) {
	System.out.println(" remove "+name);
}
}
