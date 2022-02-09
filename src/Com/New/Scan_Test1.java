package Com.New;

import java.util.Scanner;

public class Scan_Test1 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
//		System.out.println(" line ");

		String l = Sc.nextLine();
		System.out.println(l);

//		System.out.println("Enter the 1st Value");

		int a = Sc.nextInt();
		System.out.println(a);

//		System.out.println("Deciaml Value");

		float f = Sc.nextFloat();
		System.out.println(f);

	}

}
