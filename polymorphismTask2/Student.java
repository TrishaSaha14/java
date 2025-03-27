package polymorphismTask2;

public class Student extends Person{
	private int studentId;
	
	public Student(String name,int age,int studentId) {
		super(name,age);
		this.studentId=studentId;
	}
	
	public void displayStudentInfo() {
		super.displayInfo();
		System.out.println("Student id: "+this.studentId);
	}
}
