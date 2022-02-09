package Com.New;

public class Strin_Test {
	public static void main(String[] args) {

		String s = "Welcome to JAVA";
		String s1 = " And Selinum";

		int a = s.length();
		System.out.println(a);

		boolean b = s.equals("Welcome to JAVA");
		System.out.println(b);

		boolean c = s.equalsIgnoreCase("Welcome to java");
		System.out.println(c);

		boolean d = s.startsWith("Wel");
		System.out.println(d);

		boolean e = s.endsWith("VA");
		System.out.println(e);

		String f = s.toUpperCase();
		System.out.println(f);

		String g = s.toLowerCase();
		System.out.println(g);

		char h = s.charAt(5);
		System.out.println(h);

		int i = s.indexOf('J');
		System.out.println(i);

		int j = s.lastIndexOf('A');
		System.out.println(j);

		boolean k = s.contains("to");
		System.out.println(k);

		String l = s.replace("to", "2");
		System.out.println(l);

		String m = s.concat(s1);
		System.out.println(m);

		String n = s.substring(7);
		System.out.println(n);

		String o = s.substring(3, 15);
		System.out.println(o);

		int p = s1.length();
		System.out.println(p);

		String q = s1.trim();
		System.out.println(q);

	
	
	}

}
