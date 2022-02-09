package Com.New;

public class Multilevel_Inherit extends Single_Inherit {

	public void employeeSalary() {
		System.out.println("One lakh Fift thousand only");
	}

	public static void main(String[] args) {
		Multilevel_Inherit m = new Multilevel_Inherit();
		m.employeeName();
		m.employeeId();
		m.employeeBloodGroup();
		m.employeeSalary();
		m.employeeResident();
		m.employeePostal();
		m.employeeState();

	}

}
