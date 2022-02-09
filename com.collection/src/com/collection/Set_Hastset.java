package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Set_Hastset {

	public static void main(String[] args) {

		Set<Object> s = new HashSet<Object>();

		s.add(99);
		s.add(10);

		// it will not allow the duplicate value

		s.add(10);
		s.add(11);
		s.add("Grassping");
		s.add(null); 
		s.add(null);// It will allow Single null value . not a duplicate null values.
		

		for (Object object : s) {
			System.out.println(object);
		}
		
		// Hashset will print the values in random order
		
		System.out.println(s);

		// In set we can use only Size, Contain, clear, addall, add and retain
		// In set we cannot use set, add, remove, index, lastindex
		// It is because set is value based not index based.

	}

}
