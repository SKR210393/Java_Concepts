package Com.New;

public class FullyAbst_Test implements Fully_Abst{

	@Override
	public void employeeSalary() {
System.out.println(150000);		
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
		FullyAbst_Test f = new FullyAbst_Test();
		f.employeeBand();
		f.employeeRating();
		f.employeeSalary();
	}
	
}
