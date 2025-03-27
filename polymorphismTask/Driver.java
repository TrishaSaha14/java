package polymorphismTask;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new FullTimeEmployee("Trisha Saha",50000.00,10000);
		e1.employeeinfo();
		((FullTimeEmployee)e1).jobRole();
		Employee e2 = new PartTimeEmployee("Trisha Saha",50000.00,63);
		e2.employeeinfo();
		((PartTimeEmployee)e2).jobDesignation();
		
		details(e2);
	}
	
	static void details(Employee e) {
		if(e instanceof FullTimeEmployee) {
			e.jobRole();
		}
		else {
			e.jobRole();
			((PartTimeEmployee)e).jobDesignation();
		}
	}
}
