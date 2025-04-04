package comparable_and_comparator_interface;

import java.util.Comparator;

public class CompareBySalary implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		return (int) (e1.salary-e2.salary);
	}
	
}
