package Com.New;

public class Single_Inherit extends Ooops_New {

	public void employeeResident() {
		System.out.println("Chennai-Porur");
	}

	public void employeeState() {
		System.out.println("TN");
	}

	public void employeePostal() {
		System.out.println(600074);
	}

	public static void main(String[] args) {

		Single_Inherit s = new Single_Inherit();
		s.employeeName();
		s.employeeBloodGroup();
		s.employeeId();
		s.employeeResident();
		s.employeePostal();
		s.employeeState();

	}

}
