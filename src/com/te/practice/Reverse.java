package com.te.practice;

import java.io.FileNotFoundException;

public class Reverse extends FileNotFoundException  {
public static void main(String[] args) {
	
	String name="darshan";
	int lenght=name.length();
	String rev="";
	
	for (int i=lenght-1; i>=0; i--) {
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
}
}
