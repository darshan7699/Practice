package com.te.exception;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
 System.out.println("enter numrator");
 int a;
 a=scanner.nextInt();
 System.out.println("enter denominator");
 int b;
 b=scanner.nextInt();
 int res=0;
 try {
	 res=a/b;   
	 int [] x= {10,15,0,40,52};
	 System.out.println(x[res]);
 }catch (ArrayIndexOutOfBoundsException e) {
	 System.out.println("index value not present"+ e.getMessage());
}
 catch (ArithmeticException e) {
System.out.println("The denominator enterd wrong"+ e.getMessage());
}
 catch(Exception e){
	 System.out.println("The denominator entered is not valid"+ e.getMessage());
 }
 finally {
	 scanner.close();
	 System.out.println("connection closed");
}
 
 
}
}
