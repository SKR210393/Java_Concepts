package Com.New;

import java.util.Scanner;

public class Scan_Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the new Role");
		String e = sc.nextLine();
		System.out.println(e);

		System.out.println("Initiating 1st Value");

		int a = sc.nextInt();
		System.out.println(a);

		System.out.println("enter 2nd value");
		String b = sc.next();
		System.out.println(b);

		System.out.println("Enter the 3rd value");
		String c = sc.next();
		System.out.println(c);

		System.out.println("enter the decimal Value");
		float d = sc.nextFloat();
		System.out.println(d);

	}

}
