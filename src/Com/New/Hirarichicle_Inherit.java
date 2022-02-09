package Com.New;

public class Hirarichicle_Inherit extends Ooops_New {

	public void companyName() {
		System.out.println("Google");
	}

	public void employeeRole() {
		System.out.println("Sr-SDET");
	}

	public static void main(String[] args) {

		Hirarichicle_Inherit h = new Hirarichicle_Inherit();
		h.employeeName();
		h.employeeRole();
		h.employeeBloodGroup();
		h.employeeId();
		h.companyName();

	}

}
