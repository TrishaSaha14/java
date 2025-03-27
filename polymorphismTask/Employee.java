package polymorphismTask;

public class Employee {
	private String name;
	private double salary;
	
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void employeeinfo() {
		System.out.print("Name: "+this.name+"  "+"Salary: "+this.salary+"  ");
	}
	
	public void jobRole() {
		
	}
//	static void details(Employee e) {
//		if(e instanceof FullTimeEmployee) {
//			e.jobRole();
//		}
//		else {
//			e.jobRole();
//			((PartTimeEmployee)e).jobDesignation();
//		}
//	}
}
