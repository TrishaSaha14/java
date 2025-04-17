package list;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		System.out.println(al);
		ArrayList l2 = new ArrayList();
		l2.add("Hi");
		l2.add("Bye");
		al.addAll(1,l2);
		
		System.out.println(al);
		System.out.println(al.size());
		al.add(1,l2);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(((ArrayList) al.get(1)).get(1));
		ArrayList list = new ArrayList(al);
		list.add(1);
		list.add(2);
		list.addAll(al);
		list.add(1);
		list.add(null);
		list.add("Hello");
		
		al.add(0, 75);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		Integer x = 20;
		
		System.out.println(list);
		System.out.println(list.remove(x));
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.toArray());
	}
}
