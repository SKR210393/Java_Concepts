package Com.New;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorType {

	public static void main(String[] args) {

		List<Object> st = new ArrayList<Object>();
		st.add(10);
		st.add(20);
		st.add("Selenium");
		st.add('*');

//		System.out.println(st);

		ListIterator<Object> li = st.listIterator();

//		Object next = li.next();
//		System.out.println(next);
//
//		Object next2 = li.next();
//		System.out.println(next2);
//
//		Object next3 = li.next();
//		System.out.println(next3);
//
//		Object next4 = li.next();
//		System.out.println(next4);
//		
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		Iterator<Object> li1 = st.iterator();

		while (li1.hasNext()) {
			System.out.println(li1.next());
		}

	}
}
