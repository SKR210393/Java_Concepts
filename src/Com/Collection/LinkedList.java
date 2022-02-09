package Com.Collection;

import java.util.List;

public class LinkedList {

	
	public static void main(String[] args) {
		
		List<Object> ll = new java.util.LinkedList<Object>();
		
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		System.out.println("Linked List Value" + ll);
		
		ll.set(1, 500);
		ll.add(2, 99);
		
		System.out.println("Linked List Value Changed" + ll);
		
	}
}
