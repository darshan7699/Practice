package com.te.customexception.task;

import java.util.Scanner;

public class Cricket {
	Scanner sc = new Scanner(System.in);
	public void selection() {
		System.out.println("team player no");
		int a1 = sc.nextInt();
		if (a1>11) {
			try {
				throw new PlayerException("only 11 player allow");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Team selected with 11 top player");
		}

	}
	   

	public static void main(String[] args) {
		Cricket cricket = new Cricket();
		cricket.selection();
		
//	    String a[]=new String[11];
//	    System.out.println("Enter the names of players: ");
//	    for (int i = 0; i < a.length; i++) {
//			a[i]=sc.next();
//	    	if (a.length>11) {
//				throw new PlayerException("Only 11 players allow");
//			} else {
//				
//			}
//		}  
//	    sc.close();
	}
}
