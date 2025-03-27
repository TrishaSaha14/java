package polymorphismTask2;

public class Person {
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void displayInfo() {
		System.out.print("Name: "+this.name+"  "+"Age: "+this.age+"  ");

	}
	
}
