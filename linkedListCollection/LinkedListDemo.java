package linkedListCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(50.23);
		list.add(null);
		list.add(null);
		list.add('b');
		list.add("Hi");
		list.add(true);
		
		System.out.println(list);
		//Collections.sort(list);
		
		LinkedList<Employee> employees = new LinkedList<Employee>();
		employees.add(new Employee(1,"Trisha"));
		employees.add(new Employee(6,"Shreyanshi"));
		employees.add(new Employee(3,"Madhu"));
		
		Collections.sort(employees);
		System.out.println(employees);
		
		Collections.sort(employees,new CompareByName());
		System.out.println(employees);
		
		Iterator<Employee> itr1 = employees.iterator();
		while(itr1.hasNext()) {
			Employee y = itr1.next();
			if(y.name.equals("Madhu")) {
				itr1.remove();
			}
		}
		System.out.println(employees);
		
		list.push(56);							//acting as stack
		list.addFirst(85);
		list.addLast(99.3);
		System.out.println(list);
		System.out.println(list.peek());			//acting as queue
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.poll());			//acting as queue
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());			//acting as stack
		System.out.println(list);
		System.out.println(list.remove());
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list.remove(2));
		System.out.println(list);
		
		System.out.println(list.offer(null));
		System.out.println(list.offerFirst(366));
		System.out.println(list.offerLast(897));
		System.out.println(list);
		
	}
}
