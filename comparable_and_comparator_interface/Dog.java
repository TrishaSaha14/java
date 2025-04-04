package comparable_and_comparator_interface;

import java.util.Arrays;
//import java.util.Comparator;

public class Dog implements Comparable{
	String name;
	int age;
	String breed;
	
	public Dog(String name,int age,String breed) {
		this.name=name;
		this.age=age;
		this.breed=breed;
	}

	@Override
	public String toString() {
		
		return "Name: "+name+" Age: "+age+" Breed: "+breed;
	}
	
	public static void main(String[] args) {
		Dog[] arr = new Dog[3];
		Dog d1 = new Dog("Tom",5,"Lab");
		Dog d2 = new Dog("Jelly",6,"GermanSheph");
		Dog d3 = new Dog("Piku",3,"GoldRetr");
		arr[0]=d1;
		arr[1]=d2;
		arr[2]=d3;
		
		
		Arrays.sort(arr,new CompareBasedOnBreed());
		for(Dog dog:arr) {
			System.out.println(dog);
		}
		
	}

	@Override
	public int compareTo(Object o) {
		Dog d = (Dog)o;
		
		if(this.name.compareTo(d.name)!=0) {
			return this.name.compareTo(d.name);
		}
		if((this.age-d.age)!=0) {
			return this.age-d.age;
		}
		return 0;
	}
	
	
}
