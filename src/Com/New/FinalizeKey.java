package Com.New;

public class FinalizeKey {

	public FinalizeKey(String a) {
		System.out.println(a);
	}

	public FinalizeKey(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) throws Throwable {
		FinalizeKey f = new FinalizeKey("I am New");
		FinalizeKey f1 = new FinalizeKey(10, 20);
		f.finalize();
		f1.finalize();
		
	}

}
