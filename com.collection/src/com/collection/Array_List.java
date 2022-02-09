package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {

		List<Object> i = new ArrayList<Object>();

		i.add(10);
		i.add(100);
		i.add("Java");
		i.add("&");

		List<Object> j = new ArrayList<Object>();

		j.add(15);
		j.add(10);
		j.add("Java");
		j.add("&");

		for (int j2 = 0; j2 < j.size(); j2++) { // need to declare the condition part object reference name.size to
												// print value
			System.out.println(j.get(j2));
		}
		int s = i.size();
		System.out.println(s);

		int s1 = j.size();
		System.out.println(s1);

		Object o = i.get(3);
		System.out.println(o);

		Object o1 = j.get(2);
		System.out.println(o1);

		int in = i.indexOf(10);
		System.out.println(in);

		int in1 = j.lastIndexOf("&");
		System.out.println(in1);

		boolean c = i.contains(10);
		System.out.println(c);

		j.remove(2);
		System.out.println(j);

		j.addAll(i);
		System.out.println(j);

		i.retainAll(j);
		System.out.println(i);

		// Why it is print Java, It declared only in i & not i in j

		i.removeAll(j);
		System.out.println(i);
	}

}
