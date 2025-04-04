package comparable_and_comparator_interface;

import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(01,"Trisha",5000);
		Employee e2 = new Employee(02,"Madhu",6000);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for comparing based on id \nEnter 2 for comparing based on name \nEnter 3 for comparing based on salary ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				compareById(e1,e2);
			case 2:
				compareBasedOnName(e1,e2);
			case 3:
				compareBySalary(e1,e2);
		}
		
		
	}
	public static void compareBySalary(Employee e1,Employee e2) {
		CompareBySalary cs = new CompareBySalary();
		if(cs.compare(e1, e2)>0) {
			System.out.println("e1 is greater");
		
	}
		else if(cs.compare(e1, e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
	
	public static void compareBasedOnName(Employee e1,Employee e2) {
		if(e1.compareTo(e2)>0) {
			System.out.println("e1 is greater");
		
	}
		else if(e1.compareTo(e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
	public static void compareById(Employee e1,Employee e2) {
		CompareBySalary cs = new CompareBySalary();
		if(cs.compare(e1, e2)>0) {
			System.out.println("e1 is greater");
		
	}
		else if(cs.compare(e1, e2)<0) {
			System.out.println("e2 is greater");
		}
		else {
			System.out.println("e1 and e2 are equal");
		}
	}
}
