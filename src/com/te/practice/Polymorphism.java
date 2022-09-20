package com.te.practice;

import java.util.Scanner;

public class Polymorphism {
	static int temp = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		if (a.charAt(0) == 's') {
			temp = a.length() - 1;
			if (temp % 2 != 0) {
				temp = temp - 1;
			}
		}
		System.out.println(new Polymorphism().hashCode());
	}

	@Override
	public int hashCode() {
		return temp;
	}

}
