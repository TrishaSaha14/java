package reflectionAPI;

public class Employee {
	private String name;
	private int id;
	private int age;
	private double salary;
	
	public Employee(String name,int id,int age, double salary) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.salary=salary;
	}

	@Deprecated
	public String getName() {
		return name;
	}

	@Deprecated
	public int getId() {
		return id;
	}

	@Deprecated
	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		
		return name+"  "+id+"  "+age+" "+salary;
	}

	
}
