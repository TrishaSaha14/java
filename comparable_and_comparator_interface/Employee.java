package comparable_and_comparator_interface;

public class Employee implements Comparable{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "Id: "+id+" "+"Name: "+name+" "+"Salary: "+salary;
	}
//based on string
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		
		return this.name.compareTo(e.name);
	}

	//based on salary
//	public int compareTo(Object o) {
//		Employee e = (Employee)o;
//		return (int)(this.salary-e.salary);
//	}
}
