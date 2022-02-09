package Com.New;

public class String_TypesofJava {

	public static void main(String[] args) {

		// Immutable
		// Literal
		// Non Changeable

		String s = "Java String";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

		String s1 = "Java String";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

		String ss = "Selenium";
		System.out.println(ss);
		System.out.println(System.identityHashCode(ss));

		String s2 = s.concat(s1);
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
	}
}
