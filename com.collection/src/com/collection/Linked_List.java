package com.collection;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {

		List<Object> l = new LinkedList<Object>();

		l.add(10);
		l.add(11);
		l.add("Java");
		l.add(10);
		l.add(9);

		List<Object> l1 = new LinkedList<Object>();

		l1.add(9);
		l1.add(10);
		
		// set will remove and replace the value initialized in respective index

		l.set(3, "element");
		System.out.println(l);

		Object object = l.get(2);
		System.out.println(object);

		for (Object ob : l) {
			System.out.println(ob);
		}

	}

}
