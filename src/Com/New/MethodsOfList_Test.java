package Com.New;

import java.util.ArrayList;
import java.util.List;

public class MethodsOfList_Test {

	public static void main(String[] args) {

		List<Object> s = new ArrayList<Object>();
		s.add(8);
		s.add(99);
		s.add(55);
		s.add("Selinum");
		s.add('$');
		s.add(25.99);

		List<Object> ss = new ArrayList<Object>();

		ss.add(99);
		ss.add("Java");
		ss.add(99.99);

//		System.out.println(s);
//
//		int a = s.size();
//		System.out.println(a);
//
//		Object b = s.get(4);
//		System.out.println(b);
//
//		Object c = s.get(3);
//		System.out.println(c);
//
//		s.add(2, 555);
//		System.out.println(s);
//
//		s.set(6, 2.99);
//		System.out.println(s);
//
//		int d = s.indexOf(55);
//		System.out.println(d);
//
//		int e = s.lastIndexOf(2.99);
//		System.out.println(e);
//	
//		boolean f = s.contains('$');
//		System.out.println(f);
//	
//		s.remove(6);
//		System.out.println(s);

		s.addAll(ss);
		System.out.println(s);

		s.retainAll(ss);
		System.out.println(s);

		s.removeAll(ss);
		System.out.println(s);
	}

}
