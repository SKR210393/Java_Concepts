package Com.New;

public class String_TypesOfJava2 {

	public static void main(String[] args) {

		// Non-literal
		// Mutable
		// Changeable

		// StringBuffer

		StringBuffer s = new StringBuffer("Java String");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

		StringBuffer s1 = new StringBuffer("Java String");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));

		// It will share the memory with duplicate value at the time of Append / Concavinate
		// It will create separate memory for duplicate value
		
		StringBuffer append = s.append(s);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));

		// StringBulider

		// It will  share the memory with duplicate value at the time of Append / Concavinate
		// It will create separate memory for duplicate value
		
		StringBuilder sb = new StringBuilder("Selenium");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

		StringBuilder sb1 = new StringBuilder("Selenium");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));

		
		StringBuilder append2 = sb.append(sb1);
		System.out.println(append2);
		System.out.println(System.identityHashCode(append2));
	}

}
