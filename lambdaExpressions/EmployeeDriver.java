package lambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriver {
	public static void main(String[] args) {

		Employee e = new Employee(5,"Tri");
		Employee e1 = new Employee(10,"Mad");
		Employee e2 = new Employee(2,"Shrey");
		
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		
		l1.add(e);
		l1.add(e1);
		l1.add(e2);
		
		//Comparator c =(o1,o2)->((Employee)o1).name.compareTo(((Employee)o2).name);
		
		Comparator<Employee> c =(o1,o2)->o1.name.compareTo(o2.name);
		Collections.sort(l1,c);
		System.out.println(l1);
	}
}
