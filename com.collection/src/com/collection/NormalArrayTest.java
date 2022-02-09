package com.collection;

public class NormalArrayTest{

	public static void main(String[] args) {
		String a[] = new String[2];

		a[0] = "Java";
		a[1] = "Selenium";

		System.out.println(a[0]);
		System.out.println(a[1]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (String s : a) {
			System.out.println(s);
		}

		int b[] = new int[2];

		b[0] = 1;
		b[1] = 2;

		System.out.println(b[0]);
		System.out.println(b[1]);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		for (int i : b) {
			System.out.println(i);
		}
	}

}
