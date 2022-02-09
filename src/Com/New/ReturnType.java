package Com.New;

public class ReturnType {

	public int markSheet(int a , int b) {
		
		return a + b;
	}
	
	public int markId( int a, int b) {
		return a + b;

	}

	public static void main(String[] args) {

		ReturnType o = new ReturnType();
		
		int m = o.markSheet(99, 80);
		System.out.println(m);
		int m1 = o.markId(43, 44);
		System.out.println(m1);
	}

}
