package Com.New;

import java.util.LinkedList;
import java.util.List;

public class LinkList_Test {

	public static void main(String[] args) {

		List<Object> p = new LinkedList<Object>();

		p.add(10);
		p.add(20);
		p.add(30);
		p.add("Winner");
		p.add('%');

		System.out.println(p);

		for (Object ss : p) {
			System.out.println(ss);
		}

		int b = p.size();
		System.out.println(b);

		Object c = p.contains("Winner");
		System.out.println(c);

		int d = p.indexOf("Winner");
		System.out.println(d);

		int e = p.lastIndexOf('%');
		System.out.println(e);

		p.set(3, "Selinum-Winner");
		System.out.println(p);

		for (Object tt : p) {
			System.out.println(tt);

			boolean contains = p.contains('%');
			System.out.println(contains);
		}
	}

}
