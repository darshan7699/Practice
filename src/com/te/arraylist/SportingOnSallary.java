package com.te.arraylist;

import java.util.Comparator;

public class SportingOnSallary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
return o1.getsal().compareTo(o2.getsal());
	}

}
