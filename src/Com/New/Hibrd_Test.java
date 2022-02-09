package Com.New;

public class Hibrd_Test implements FullyAbstTest2, Hibrd_InterfaceTest {

	@Override
	public void employeeSalary() {
		System.out.println(155000);
	}

	@Override
	public void employeeRating() {
		System.out.println(5.5);
	}

	@Override
	public void employeeBand() {
		System.out.println("A");
	}

	@Override
	public void name() {
		System.out.println("Starc");
	}

	@Override
	public void nameID() {
		System.out.println("444");
	}

	@Override
	public void employeeName() {
		System.out.println("Star");
	}

	@Override
	public void employeeId() {
		System.out.println("786");
	}

	public static void main(String[] args) {

		Hibrd_Test h = new Hibrd_Test();
		h.name();
		h.nameID();
		h.employeeName();
		h.employeeId();
		h.employeeRating();
		h.employeeBand();
		h.employeeSalary();

	}

}
