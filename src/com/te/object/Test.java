package com.te.object;

public class Test implements Cloneable {
	String name;
public boolean equals (Object obj) {
	return true;
}
public static void main(String[] args) throws CloneNotSupportedException {
String s1="vinayak";
String s2="vinayak";
String string = new String("vinayak");
String string2 = new String("vinayak");

System.out.println(string.equals(string2));
System.out.println(s1.equals(s2));

    Test test = new Test();
	Test test2 = new Test();
	//Test test3 = new Test();
	
	System.err.println(test.equals(test2));
	
	boolean equals=test.equals(test2);
	System.out.println(equals);
	
	//test3=null;
	System.gc();
	System.out.println();
	
	
	
	
	
	
	
	
//	Test test = new Test();
//	Test test2 = new Test();
	
//	System.out.println(test.clone());
//	System.out.println(test.hashCode());
//	Test clone=(Test)test.clone();
//	System.out.println(clone.hashCode());
//	System.out.println(clone.name);
//	System.out.println(test.getClass());
//	System.out.println(test.hashCode());
}
} 
