package com.te.exception;

public class Test2 {
	public void m1() {
		try {
			m3();
		} catch (Exception e) {
			System.out.println("exception is handled");
		}
	}

	public void m3() {
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("handled in m2");
		}
	}

	public static void main(String[] args) {
		System.out.println("program start");
		new Test2().m3();
		System.out.println("program end");
	}
}
