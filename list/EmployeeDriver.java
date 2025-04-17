package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeDriver {
	public static void main(String[] args) {
//		Employee e1 = new Employee(1,"Trisha");
//		Employee e2 = new Employee(2,"Shreyanshi");
//		Employee e3 = new Employee(3,"Madhu");
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Trisha"));
		employees.add(new Employee(6,"Shreyanshi"));
		employees.add(new Employee(3,"Madhu"));

		for(Employee e : employees) {
			System.out.println(e);
		}
//		
//		Iterator<Employee> itr = employees.iterator();
//		while(itr.hasNext()) {
//			Employee x = itr.next();
//			if(x.name.equals("Trisha")) {
//				itr.remove();
//			}
//		}
		System.out.println(employees);
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(null);
		al1.add('c');
		al1.add("Hi");
		al1.add(50.23);
		
		Collections.sort(employees);     //sorting based on id
		System.out.println(employees);
		
		Collections.sort(employees, new CompareByName());   //sorting based on name
		
		System.out.println(employees);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
//		for(int i : al) {
//			
//			if(i==30) {
//				Integer x = i;
//				al.remove(x);
//				break;
//			}
//			
//		}
		System.out.println(al);
		Iterator<Integer> itr1 = al.iterator();
		while(itr1.hasNext()) {
			int y = itr1.next();
			if(y==20) {
				itr1.remove();
			}
		}
		
		System.out.println(al);
	}
}
