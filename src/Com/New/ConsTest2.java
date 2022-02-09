package Com.New;

public class ConsTest2 {

	// Non Parameterized Constructor

	public ConsTest2(String a) {
		System.out.println(a);
	}

//  Parameterized Constructor

//	public ConsTest2(int a) {
//		System.out.println(a);
//	}

	public void testValue(int b) {
		System.out.println(b);
	}

	public void testMark(int c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		ConsTest2 f = new ConsTest2("Java");
//		ConsTest2 f1 = new ConsTest2(110);
		f.testValue(100);
		f.testMark(55);
	}
}
