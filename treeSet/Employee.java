package treeSet;

public class Employee implements Comparable<Employee>{
	String name;
	double salary;
	
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return name+"  "+salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int)(this.salary-o.salary);
	}
	
	
}
