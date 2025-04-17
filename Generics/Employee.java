package Generics;

import java.util.HashMap;

//public class Employee implements Comparable{
//	String name;
//	int id;
//
//	public Employee(String name, int id) {
//		this.name = name;
//		this.id = id;
//	}
//
//	@Override
//	public String toString() {
//		return "Name: " + name + " Id: " + id;
//	}
//
//	@Override
//	public int compareTo(Object o) {
//		Employee e = (Employee)o;
//		return (this.id-e.id);
//	}
//
//}

public class Employee<T>{
	T data1;
	T data2;
	
	Employee(T data1,T data2){
		this.data1=data1;
		this.data2=data2;
	}
	
	public String toString() {
		return data1+"   "+data2;
	}
	
	public static <T> void print(T[] arr) {
		for(T i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Employee<Integer> e1 = new Employee<Integer>(14,15);
		Employee<String> e2 = new Employee<String>("Hello","world");
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(11, "World");
		System.out.println(hm);
		System.out.println(e1);
		System.out.println(e1.data1+e1.data2);
		System.out.println(e2);
		System.out.println(e1.data1 instanceof Integer);
		
		Integer[] arr1 = {1,2,3,4,5};
		String[] arr2 = {"Hello","World","Demo"};
		
		print(arr1);
		print(arr2);
	}
}