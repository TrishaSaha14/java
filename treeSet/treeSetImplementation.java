package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetImplementation {
	public static void main(String[] args) {
		//TreeSet tree = new TreeSet();
//		tree.add(10);
//		tree.add(10.6);
//		tree.add("Hi");
//		tree.add('c');
//		System.out.println(tree);     //ClassCastException (No heterogeneous data)
		
//		tree.add(null);
//		System.out.println(tree);   //NullPointerException
//		
//		tree.add(80);
//		tree.add(50);
//		tree.add(80);
//		tree.add(90);
//		tree.add(20);
//		System.out.println(tree);       //sorts in ascending order by default and duplicates are removed
		
		TreeSet<Employee> emp = new TreeSet<Employee>();
		emp.add(new Employee("Tri",5000.00));
		emp.add(new Employee("Shre",6000.00));
		emp.add(new Employee("Mad",4000.00));
		
		System.out.println(emp);   //classCast exception so we need to override the compareTo()
		
		TreeSet<Employee> emp1 = new TreeSet<Employee>(new CompareByName());
		emp1.add(new Employee("Tri",5000.00));
		emp1.add(new Employee("Shre",6000.00));
		emp1.add(new Employee("Mad",4000.00));
		System.out.println(emp1);
		
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
