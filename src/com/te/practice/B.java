package com.te.practice;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class B  {
public static void main(String[] args) {
	TreeMap<Object,Object> treeMap = new TreeMap<>();
	treeMap.put(1, "darshan");
	treeMap.put(2, "ruta");
	treeMap.put(3, "rashi");
	treeMap.put(4, "sandesh");
	
	Set<Entry<Object,Object>> entrySet = treeMap.entrySet();
//	for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
//		Entry<Object, Object> entry = (Entry<Object, Object>) iterator.next();
//		
	for (Entry<Object, Object> entry2 : entrySet) {
		System.out.println(entry2);
		
	}
	}
	
}

