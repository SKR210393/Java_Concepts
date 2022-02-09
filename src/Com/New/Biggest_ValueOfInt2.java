package Com.New;

import java.util.Scanner;

public class Biggest_ValueOfInt2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of N");

		// Enter the length / size of n

		int n = sc.nextInt();

		// Array Syntax

		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter the " + i + " Value");
			a[i] = sc.nextInt();
			// eg a[0] = sc.nextInt();
		}

		System.out.println("test");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
