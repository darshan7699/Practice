  package com.te.arraylist.my;

import java.util.Arrays;

import java.util.Iterator;

public class MyArraylist {
	private Object[] array;
	private int index;

	public MyArraylist() {
     array=new Object[10];
	}

	public int size() {
		return index;
	}

	public void add(Object obj) {
		System.out.println(array);
		if (index >= array.length - 1) 
			increaseCapacity();
		else
		array[index] = obj;
		index++;

	}

	private void increaseCapacity() {
		Object[] temp = new Object[((array.length * 3) / 2) + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}
	
	public void remove(Object obj) {
		for (int i = 0; i < index; i++) {
			if (array[i].equals(obj)) {
				for (int j = i; j < index; j++) {
					array[j] = array[j + 1];
				}
				index--;
				return;
			}
		}
	}

	public Object get(int index) {
		return array[index];

	}
	
	

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + ", index=" + index + "]";
	}


	public Iterator<Object> iterator() {
		return new MyItr();
	}

	class MyItr implements Iterator<Object> {
		int index;

		@Override
		public boolean hasNext() {
			if (array[index] != null)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			Object object = array[index];
			index++;
			return object;
		}

	}

}
