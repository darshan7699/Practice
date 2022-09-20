package com.te.exception;

public class Demo2 {
	public void m1() {
		try {
			m2(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void m2(int num) throws Exception {
		if (num == 1) {
			throw new Exception();
		}else {
			System.out.println(num);
		
		}
	}


public static void main(String[] args) {
	System.out.println("programm start");
	try {
	new Demo2().m1();
	}catch (Exception e) {
System.out.println("from main");	
}
	System.out.println("program end");
}
}