package Com.Collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);

		System.out.println("Array List Value : " + al);


		al.set(1, 20);
		al.add(2, 99);
		
		System.out.println("Array List Value Changed: " + al);

	}

}
