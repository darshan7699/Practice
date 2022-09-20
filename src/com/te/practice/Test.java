package com.te.practice;

public class Test {
public static void main(String[] args) {
	int a=444321;
	int rev=0,rem;
	
	while(a!=0) {
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;
	}
	System.out.println(rev);
}
}
