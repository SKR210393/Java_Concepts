package Com.New;

public class TypesOfVarriable {

	int z = 199; // it is class variable

	public void Varriable() {
		int a = 100;
		int b = 55; // these a, b & c are local variables
		int c = a + z + b;
		System.out.println(c);

	}

	public static void main(String[] args) {

		TypesOfVarriable v = new TypesOfVarriable();

		// z class variable converted to static variable

		System.out.println(v.z);

		v.Varriable();

	}

}
