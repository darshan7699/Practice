package com.te.arraylist.my;

//import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		MyArraylist myArrayList = new MyArraylist();
		myArrayList.add(112);
		myArrayList.add(113);
		myArrayList.add(114);
		myArrayList.add(115);
		myArrayList.add(116);
		myArrayList.add(117);
		myArrayList.add(118);
		myArrayList.add(119);
		myArrayList.add(122);
		myArrayList.add(123);
		myArrayList.add(156);
		myArrayList.add(189);
		System.out.println(myArrayList.size());
		myArrayList.remove(115);
//		for (int i = 0; i < myArrayList.size(); i++) {
//			System.out.println(myArrayList.get(i) + "::" + myArrayList.size());
//		}

//		Iterator<Object> iterator = myArrayList.iterator();
//		while (iterator.hasNext()) {
//			iterator.next();
//		}
		System.out.println(myArrayList);
	}
}
