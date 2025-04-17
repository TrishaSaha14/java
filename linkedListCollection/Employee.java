package linkedListCollection;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+"  "+name;
	}

	public int compareTo(Employee o) {
		
		//Employee e = (Employee)o;
		return this.id-o.id;
	}
}