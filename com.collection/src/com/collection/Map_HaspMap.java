package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_HaspMap {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "New");
		m.put(2, "Old");
		m.put(3, "Java");
		m.put(4, "Selenium");
		m.put(null, null);
		m.put(null, "Newer");

		m.put(5, "Start");
		m.put(5, "Start");

//		Key ----> 
//
//		it will not allow duplicate it can be override.
//	
//		it will allow override null [ duplicate ]
//
//            value ----->
//
//			 The value will allow duplicate
//
//		 The value will allow the both null .
//
//
//         	Map ----- > ( Curly Bases ) { }

		System.out.println(m);

		int size = m.size();
		System.out.println(size);

		String string = m.get(3);
		System.out.println(string);

		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);

		Collection<String> values = m.values();
		System.out.println(values);

		boolean key = m.containsKey(5);
		System.out.println(key);
	
		boolean value = m.containsValue("Java");
		System.out.println(value);
	
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}	
	
	}
}
