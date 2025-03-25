package manytomany;

public class Course {
	String name;
	Student[] students;
	
	public Course(String name, int size) {
		this.name = name;
		this.students=new Student[size];
		
	}
}
