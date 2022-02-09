package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {


	public static void main(String[] args) {

		Set<Object> s1 = new LinkedHashSet<Object>();

		s1.add(99);
		s1.add(87);
		s1.add("We can");
		s1.add(18);
		s1.add("We can");
		s1.add(99); // linked Hashset will not accept duplicate value
		s1.add(1);
		s1.add(null);
		s1.add(null); // It will allow Single null value . not a duplicate null values.
		
		// LinkedHashSet will print the values in insertion order
		
		System.out.println(s1);
		
		int size = s1.size();
		System.out.println(size);

		boolean contains = s1.contains("We can");
		System.out.println(contains);
		
		
		
		// In set we can use only Size, Contain, clear, addall, add and retain
		// In set we cannot use set, add, remove, index, lastindex
		// It is because set is value based not index based.
		
	}

}
