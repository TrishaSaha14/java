package polymorphismTask2;

public class UniDriver {
	public static void main(String[] args) {
		Student s1 = new Student("Trisha Saha",21,01);
		Professor p1 = new Professor("Rohit Kumar",26,"JAVA");
		
		University u1 = new University();
		u1.addPerson(s1);
		u1.addPerson(p1);
		u1.showPeople();
	}
}
