package Com.New;

public class Multiple_Inherit implements Fully_Abst, FullyAbstTest2 {

	@Override
	public void employeeName() {
		System.out.println("Ken");
	}

	@Override
	public void employeeId() {
		System.out.println(444);
	}

	@Override
	public void employeeSalary() {
		System.out.println("150000 Per Month");
	}

	@Override
	public void employeeRating() {
		System.out.println(5);
	}

	@Override
	public void employeeBand() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		Multiple_Inherit m = new Multiple_Inherit();
		m.employeeName();
		m.employeeId();
		m.employeeBand();
		m.employeeRating();
		m.employeeSalary();

	}
}
