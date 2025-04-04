package comparable_and_comparator_interface;

public class Person implements Comparable{
   String name;
   int age;
   
   public Person(String name,int age) {
	   this.name=name;
	   this.age=age;
   }
   public String toString() {
		return "Name: "+name+" "+"Age: "+age;
	}
@Override
public int compareTo(Object o) {
	Person p = (Person)o;
	if((this.name.compareTo(p.name))>0 || (this.name.compareTo(p.name))<0) {
		return this.name.compareTo(p.name);
	}
	
	else {
		if((this.age-p.age)>0 || (this.age-p.age)<0) {
			return this.age-p.age;
		}
		else {
			return 0;
		}
	}
}
   
   
}
