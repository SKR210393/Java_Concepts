package Com.New;

public class Arra_Test {

	public static void main(String[] args) {

		// Data Type Reference name [] = new data type[];

		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
		for (int i : a) {
			System.out.println(i);
		}
	
	}

}
