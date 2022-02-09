package Com.New;

public class Strin_Test2 {

	public static void main(String[] args) {

		String s = "Welcome to Learn Java";
		String s1 = "Happy to learn Java";
		String s3 = "";
		String s4 = "null";

		// is empty checking
		
		boolean mt = s1.isEmpty();
		System.out.println(mt);

		boolean mtt = s4.isEmpty();
		System.out.println(mtt);
	
		boolean mty = s3.isEmpty();
		System.out.println(mty);
	
	
	//split 
		
		// Split performed using For loop
		String[] sp = s.split(" ");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
			
		}
	
		// Split performed using Foreach
		
		String[] sp1 = s1.split("to ");
		for (String ss : sp1) {
			System.out.println(ss);
			
		}
	
	
	}
}
