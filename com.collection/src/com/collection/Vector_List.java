package com.collection;

import java.util.List;
import java.util.Vector;

public class Vector_List {

	public static void main(String[] args) {

		List<Object> n = new Vector<Object>();

		n.add(10);
		n.add(99);
		n.add("Success");
		n.add("*");

		System.out.println(n);

		n.set(3, '&');
		Object g = n.get(3);
		System.out.println(g);

	}

}
