 package com.te.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmpArray {
public static void main(String[] args) {
	ArrayList<Employee> arrayList = new ArrayList<Employee >();
	arrayList.add(new Employee("darshan", 10, 12002));
	arrayList.add(new Employee("manish", 105, 5464564));
	arrayList.add(new Employee("mohit", 17, 231211));
	
	//System.out.println(arrayList.get(1)); 
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("order with name or sal");
	String next=scanner.next();
	SortingOnName sortingOnName = new SortingOnName();
	SportingOnSallary sportingOnSallary = new SportingOnSallary();
	
	
	if(next.equalsIgnoreCase("name")){
		Collections.sort(arrayList,sortingOnName);
	
	}if(next.equalsIgnoreCase("sallary")) {
		Collections.sort(arrayList,sportingOnSallary);
	}if(next.equalsIgnoreCase("id")) {
		Collections.sort(arrayList);
		Iterator<Employee> iterator = arrayList.iterator();
        
		while (iterator.hasNext()) {
	System.out.println(iterator.next());
	}
	scanner.close();
//
//	System.out.println("================");
//	Collections.sort(arrayList);
//	Iterator<Employee> iterator = arrayList.iterator();
//	while (iterator.hasNext()) {
//		System.out.println(iterator.next());
//	}

//for (Object object : arrayList) {
//	System.out.println(object);
//}

}
}}
