package Generics;

public class Person {
	private int id;
	private String name;
	
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+"  "+name;
	}
}
