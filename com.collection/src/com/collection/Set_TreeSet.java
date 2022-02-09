package com.collection;

import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {

		Set<Object> t = new TreeSet<Object>();

		t.add(91);
		t.add(86);
		t.add(11);
		t.add(1);
		t.add(22);
		// t.add(null);// It will not allow even Single null value .

		// Treeset will print the values in Ascending order

		System.out.println(t);

	}
}
