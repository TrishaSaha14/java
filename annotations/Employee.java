package annotations;

public class Employee {
	@Salary(salary=25000)
	double salary;
	
	String name = "Trisha";

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+salary;
	}
	
//	@Salary(bonus=2000)
//	double bonus;
	
	
}
