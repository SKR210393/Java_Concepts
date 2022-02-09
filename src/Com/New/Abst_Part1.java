package Com.New;

public class Abst_Part1  extends Abst_Part{

@Override
public void employeeRating() {
	System.out.println(5);
}	


public static void main(String[] args) {
	Abst_Part1 a =new Abst_Part1();
	a.employeeName();
	a.employeeRating();
}
}
