package comparable_and_comparator_interface;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person("Ram",26);
		Person p2 = new Person("Rohit",24);
		int result = p1.compareTo(p2);
		if(result<0) {
			System.out.println("p2 is greater");
		}
		else if(result>0) {
			System.out.println("p1 is greater");
		}
		else {
			System.out.println("p1 and p2 are equal");
		}
		
		
		
	}
}
