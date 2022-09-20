package com.te.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collector;

public class Mobile {
	public static void main(String[] args) {
		ArrayList<JohnMob> arrayList = new ArrayList<JohnMob>();
		arrayList.add(new JohnMob("darshan", "1+", 160));
		arrayList.add(new JohnMob("komal", "mi", 140));
		arrayList.add(new JohnMob("darshan", "vivo", 150));

		arrayList.stream().sorted(Comparator.comparing(JohnMob::getName)).forEach(System.out::println);

		// arrayList.stream().sorted((o1,o2)->{return
		// o1.price-o2.price;}).forEach(System.out::println);

		 Collections.sort(arrayList);

//	
//	//Collections.sort(arrayList);
//	Iterator<Object> iterator = arrayList.iterator();
//	
//	for (Iterator iterator2 = arrayList.iterator(); iterator2.hasNext();) {
//		Object object = (Object) iterator2.next();
//		System.out.println(object);
//	}
//	
	}
}
