package com.te.practice;

public class Palindrome {
public static void main(String[] args) {
	String name="";
	String rev="";
	
	for (int i =name.length()-1;i>=0; i--) {
		rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	
	
	boolean equals = rev.equals(name);
	
		if(equals) {
			System.out.println("it is palidrome");
	}else {
		System.out.println("not a polidrome");
	}
	
}

}
