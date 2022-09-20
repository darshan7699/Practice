package com.te.practice;

public class PalidromeInt {
	public static void main(String[] args) {

		int a = 1221;
		int temp = a;
		int rev=0, rem;

		while (a != 0) {
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println(a);
		System.out.println(rev);

		if (temp == rev) {
			System.out.println("its a pallindrome");
		} else {
			System.out.println("its not pallindrome");
		}
	}
}
