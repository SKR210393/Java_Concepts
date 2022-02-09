package Com.New;

import java.util.Scanner;

public class Reverse_Value {

	public static void main(String[] args) {

		int j = 0;
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int n = sc.nextInt();
		int a = n;

		while (a > 0) {

			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;

		}
		System.out.println(j);

	}

}
