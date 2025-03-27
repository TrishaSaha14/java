package polymorphismTask;

public class FullTimeEmployee extends Employee {
	private int bonus;
	public FullTimeEmployee(String name,double salary,int bonus) {
		super(name,salary);
		this.bonus=bonus;
	}
	
	public void employeeinfo() {
		super.employeeinfo();
		System.out.println("Bonus: "+this.bonus);
	}
	
	public void jobRole() {
		System.out.println("\nThe employee has a job role of Software Developer");
	}
}
