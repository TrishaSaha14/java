package Generics;

public class Driver {
	public static void main(String[] args) {
		Student<Person> student = new Student<Person>(new Person(10,"Rohit"));
		printdetails(student);
	}
	
	public static void printdetails(Student<? extends Person> student) {
		Person p = student.obj;
		System.out.println(p);
	}
}
