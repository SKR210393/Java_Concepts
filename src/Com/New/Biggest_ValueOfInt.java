package Com.New;

import java.util.Scanner;

public class Biggest_ValueOfInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Value");

		int a = sc.nextInt();

		System.out.println("Enter the second value");

		int b = sc.nextInt();

		System.out.println("Enter the Thrid value");

		int c = sc.nextInt();

		System.out.println("Enter the Forth Value");

		int d = sc.nextInt();

		if (a > b && a > c && a > d) {
			System.out.println("A is the biggest value");
		}

		if (b > a && b > c && b > d) {
			System.out.println("B is the biggest value");
		}

	if (c>a && c>b && c>d) {
		System.out.println(" C is the biggest value");
	}
	
	if (d>a && d>b && d>c) {
		System.out.println("D is the biggest value");
	}
	
	}

}
