package Com.New;

public class TypeCasting1 {

	public static void main(String[] args) {
// Byte, short, int, long, float, double
		// Widening convert the small date value to big data type value
		// byte to short
		// short to int
		// int to long etc

		// Widening

		byte a = 100;
		short b = a;
		System.out.println(b);

		short c = 199;
		int d = c;
		System.out.println(d);

		int e = 655656;
		long f = e;
		System.out.println(f);

		float g = 9;
		double i = g;
		System.out.println(i);

		// Narrowing
		// Byte, short, int, long
		// Widening convert the big date value to small data type value

		long x = 44444444;
		byte y = (byte) x;
		System.out.println(y);

		long k = 44444444;
		int l = (int) k;
		System.out.println(l);

		int w = 123456;
		byte u = (byte) w;
		System.out.println(u);

	}

}
