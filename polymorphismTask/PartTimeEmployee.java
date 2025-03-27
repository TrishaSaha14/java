package polymorphismTask;

public class PartTimeEmployee extends Employee {
	private int workingHours;
	public PartTimeEmployee(String name,double salary,int workingHours) {
		super(name,salary);
		this.workingHours = workingHours;
	}
	
	public void employeeinfo() {
		super.employeeinfo();
		System.out.println("Working Hours: "+this.workingHours);
	}
	
	public void jobDesignation() {
		System.out.println("\nDesignation is associate Engineer");
	}
	
	public void jobRole() {
		System.out.println("Job role of a Part Time engineer is a cloud engineer");
	}
}
