package Com.New;

public class Overload_Poly {

	public void jobTest(String a) {
		System.out.println(a);
	}

	public void jobTest(String a, String b) {
		System.out.println(a + " " + b);
	}

	public void jobTest(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Overload_Poly o = new Overload_Poly();
		o.jobTest("Java");
		o.jobTest("Java" + "-" + "Selinum");
		o.jobTest(2021);
	}
}
