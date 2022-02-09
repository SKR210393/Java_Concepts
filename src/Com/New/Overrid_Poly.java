package Com.New;

public class Overrid_Poly extends Overload_Poly {

	@Override
	public void jobTest(int a) {
		System.out.println(a);
		super.jobTest(2021);

	}

	@Override
	public void jobTest(String a, String b) {
		System.out.println(a + b);
		super.jobTest("Java", "Automation");
	}

	@Override
	public void jobTest(String a) {
		System.out.println(a);
		super.jobTest("SDET");
	}

	public void jobTest(double a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Overrid_Poly o1 = new Overrid_Poly();
		o1.jobTest(2022);
		o1.jobTest("Java", " Selinum");
		o1.jobTest(99.9);
		o1.jobTest("new");

	}
}
